package com.prpoc.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.prpoc.model.helper.NeuralNetworkFactory.generateAllSynapsesBetweenFollowingLayers;
import static com.prpoc.model.helper.NeuralNetworkFactory.makeLayerOfSize;

/**
 * Created by Grzegorz Borowik on 2017-10-03 10:11 AM.
 * e-mail: borowik.grzegorz@gmail.com
 */

public class Main {

    List<Integer> properImage = new ArrayList<>(Arrays.asList
            (0, 1, 1, 1, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0));

    List<Integer> wrongImage = new ArrayList<>(Arrays.asList
            (1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1));


    public static void main(String[] args) {

        NeuralNetwork neuralNetwork = new NeuralNetwork();

        neuralNetwork
                .addLayer(makeLayerOfSize(25))
                .addLayer(makeLayerOfSize(5))
                .addLayer(makeLayerOfSize(2))
                .addEdges(generateAllSynapsesBetweenFollowingLayers(neuralNetwork.getLayers()));

    }
}
