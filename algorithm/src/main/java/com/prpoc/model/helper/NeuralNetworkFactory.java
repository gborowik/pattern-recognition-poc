package com.prpoc.model.helper;

import com.prpoc.graph.Layer;
import com.prpoc.graph.NetworkFactory;
import com.prpoc.model.Neuron;
import com.prpoc.model.Synapse;

import java.util.Collection;
import java.util.stream.Collectors;

public class NeuralNetworkFactory implements NetworkFactory<Neuron, Synapse> {
    @Override
    public Collection<Synapse> generateAllSynapsesBetweenLayers(Layer<Neuron> layer1, Layer<Neuron> layer2) {
        return layer1.getNodes().stream()
                .flatMap(n -> generateAllSynapsesBetweenNodeAndLayer(n, layer2).stream())
                .collect(Collectors.toSet());
    }

    @Override
    public Collection<Synapse> generateAllSynapsesBetweenLayerAndNode(Layer<Neuron> layer, Neuron node) {
        return layer.getNodes().stream().map(n -> new Synapse(n, node)).collect(Collectors.toSet());
    }

    @Override
    public Collection<Synapse> generateAllSynapsesBetweenNodeAndLayer(Neuron node, Layer<Neuron> layer) {
        return layer.getNodes().stream().map(n -> new Synapse(node, n)).collect(Collectors.toSet());
    }
}
