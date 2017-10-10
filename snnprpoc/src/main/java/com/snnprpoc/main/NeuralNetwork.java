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
        return "\nNEURONS:"
                + String.join("\n", layers.stream().map(el -> el.toString())
                .collect(Collectors.toList()))
                + "\n\nSYNAPSES:"
                + String.join("; ", directedEdges.stream().map(el -> el.toString()).collect(Collectors.toList()));
    }

    public NeuralNetwork learn(List<List<List<Integer>>> inputData, List<Integer> scenario) {
        List<List<List<Double>>> encodedData = encoder(inputData);

        stimulateEncoded(encodedData, scenario);

        return this;
    }

    private void stimulateEncoded(List<List<List<Double>>> encodedData, List<Integer> scenario) {
        scenario.stream().forEach(scene -> stimulateScene(encodedData.get(scene)));
    }

    private void stimulateScene(List<List<Double>> encodedData) {
        StreamUtils.zip(inNodes.stream(), encodedData.get(0).stream(), (neuron, val) -> neuron.spike(val));
        outNodes.get(0).spike(encodedData.get(1).get(0));
    }

    protected List<List<List<Double>>> encoder(List<List<List<Integer>>> inputData) {
        return inputData.stream()
                .map(row -> row.stream()
                        .map(col -> col.stream()
                                .map(el -> el.doubleValue())
                                .collect(Collectors.toList()))
                        .collect(Collectors.toList()))
                .collect(Collectors.toList());
    }

    public NeuralNetwork launch(List<List<List<Integer>>> inputData, List<Integer> scenario) {
        List<List<List<Double>>> encodedData = encoder(inputData);

        launchEncoded(encodedData, scenario);

        return this;
    }

    private void launchEncoded(List<List<List<Double>>> encodedData, List<Integer> scenario) {
        scenario.stream().forEach(scene -> launchScene(encodedData.get(scene)));
    }

    private void launchScene(List<List<Double>> encodedData) {
        StreamUtils.zip(inNodes.stream(), encodedData.get(0).stream(), (neuron, val) -> neuron.spike(val));
    }


}
