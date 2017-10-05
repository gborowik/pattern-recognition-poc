package com.prpoc.main;

import static com.prpoc.model.helper.NeuralNetworkFactory.generateAllSynapsesBetweenFollowingLayers;
import static com.prpoc.model.helper.NeuralNetworkFactory.makeLayerOfSize;

/**
 * Created by Grzegorz Borowik on 2017-10-03 10:11 AM.
 * e-mail: borowik.grzegorz@gmail.com
 */

public class Main {

    public static void main(String[] args) {

        NeuralNetwork neuralNetwork = new NeuralNetwork();

        neuralNetwork
                .addLayer(makeLayerOfSize(25))
                .addLayer(makeLayerOfSize(5))
                .addLayer(makeLayerOfSize(2))
                .addInputNodes(neuralNetwork.getFirstLayer().getNodes())
                .addOutputNodes(neuralNetwork.getLastLayer().getNodes())
                .addEdges(generateAllSynapsesBetweenFollowingLayers(neuralNetwork.getLayers()));

    }
}
