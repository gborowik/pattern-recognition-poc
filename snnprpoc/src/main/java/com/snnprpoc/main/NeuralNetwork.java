package com.snnprpoc.main;

import com.codepoetics.protonpack.StreamUtils;
import com.snnprpoc.graph.Network;
import com.snnprpoc.model.Neuron;
import com.snnprpoc.model.Synapse;

import java.util.List;
import java.util.stream.Collectors;

public class NeuralNetwork extends Network<Neuron, Synapse> {

    @Override
    public String toString() {
        return null;
    }

    public NeuralNetwork learn(List<List<List<Integer>>> inputData, List<Integer> scenario) {
        List<List<List<Double>>> encodedData = encoder(inputData);

        stimulate(encodedData, scenario);

        return this;
    }

    private void stimulate(List<List<List<Double>>> encodedData, List<Integer> scenario) {
        scenario.stream().forEach(scene -> stimulate(encodedData.get(scene)));
    }

    private void stimulate(List<List<Double>> encodedData) {
        StreamUtils.zip(inNodes.stream(), encodedData.get(0).stream(), (neuron, val) -> neuron.spike(val));
        outNodes.get(0).spike(encodedData.get(1).get(0));
    }

    private List<List<List<Double>>> encoder(List<List<List<Integer>>> inputData) {
        return inputData.stream()
                .map(row -> row.stream()
                        .map(col -> col.stream()
                                .map(el -> el.doubleValue())
                                .collect(Collectors.toList()))
                        .collect(Collectors.toList()))
                .collect(Collectors.toList());
    }
}
