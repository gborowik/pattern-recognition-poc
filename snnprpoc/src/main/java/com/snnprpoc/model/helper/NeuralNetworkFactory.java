package com.snnprpoc.model.helper;

import com.snnprpoc.graph.Layer;
import com.snnprpoc.model.Neuron;
import com.snnprpoc.model.Synapse;
import one.util.streamex.StreamEx;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NeuralNetworkFactory {

    private static Integer neuronId = 0;

    public static Collection<Neuron> generateNeurons(Integer number) {
        neuronId += number;

        return IntStream.range(neuronId - number, neuronId).boxed()
                .map(Neuron::new).collect(Collectors.toSet());
    }

    public static Layer<Neuron> makeLayerOfSize(Integer number) {
        return new Layer<>(generateNeurons(number));
    }

    public static Collection<Synapse> generateAllSynapsesBetweenFollowingLayers(List<Layer<Neuron>> ls) {
        return StreamEx.of(ls)
                .pairMap(NeuralNetworkFactory::generateAllSynapsesBetweenTwoLayers)
                .toFlatCollection(el -> el, HashSet::new);
    }

    public static Collection<Synapse> generateAllSynapsesBetweenTwoLayers(Layer<Neuron> layer1, Layer<Neuron> layer2) {
        return layer1.getNodes().stream()
                .flatMap(n -> generateAllSynapsesBetweenNodeAndLayer(n, layer2).stream())
                .collect(Collectors.toSet());
    }

    public static Collection<Synapse> generateAllSynapsesBetweenLayerAndNode(Layer<Neuron> layer, Neuron node) {
        return layer.getNodes().stream().map(n -> new Synapse(n, node)).collect(Collectors.toSet());
    }

    public static Collection<Synapse> generateAllSynapsesBetweenNodeAndLayer(Neuron node, Layer<Neuron> layer) {
        return layer.getNodes().stream().map(n -> new Synapse(node, n)).collect(Collectors.toSet());
    }
}
