package com.prpoc.model.helper;

import com.prpoc.graph.Layer;
import com.prpoc.model.Neuron;
import com.prpoc.model.Synapse;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NeuralNetworkFactory {

    static Integer neuronId = 0;

    public Collection<Neuron> generateNeurons(Integer number) {
        neuronId += number;

        return IntStream.range(neuronId - number, neuronId).boxed()
                .map(el -> new Neuron(el)).collect(Collectors.toSet());
    }

    public Layer<Neuron> makeLayerOfSize(Integer number) {
        return new Layer<Neuron>(generateNeurons(number));
    }

    public Collection<Synapse> generateAllSynapsesBetweenLayers(Layer<Neuron> layer1, Layer<Neuron> layer2) {
        return layer1.getNodes().stream()
                .flatMap(n -> generateAllSynapsesBetweenNodeAndLayer(n, layer2).stream())
                .collect(Collectors.toSet());
    }

    public Collection<Synapse> generateAllSynapsesBetweenLayerAndNode(Layer<Neuron> layer, Neuron node) {
        return layer.getNodes().stream().map(n -> new Synapse(n, node)).collect(Collectors.toSet());
    }

    public Collection<Synapse> generateAllSynapsesBetweenNodeAndLayer(Neuron node, Layer<Neuron> layer) {
        return layer.getNodes().stream().map(n -> new Synapse(node, n)).collect(Collectors.toSet());
    }
}
