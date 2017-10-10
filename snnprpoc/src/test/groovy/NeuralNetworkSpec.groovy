package com.snnprpoc.model

import com.snnprpoc.main.NeuralNetwork
import spock.lang.Specification

import static com.snnprpoc.model.helper.NeuralNetworkFactory.generateAllSynapsesBetweenFollowingLayers
import static com.snnprpoc.model.helper.NeuralNetworkFactory.makeLayerOfSize


class NeuralNetworkSpec extends Specification {


    def createNetwork(int inputLayerSize, int hiddenLayerSize, int outputLayerSize) {
        NeuralNetwork neuralNetwork = new NeuralNetwork();

        neuralNetwork
                .addLayer(makeLayerOfSize(inputLayerSize))
                .addLayer(makeLayerOfSize(hiddenLayerSize))
                .addLayer(makeLayerOfSize(outputLayerSize))
                .addInputNodes(neuralNetwork.getFirstLayer().getNodes())
                .addOutputNodes(neuralNetwork.getLastLayer().getNodes())
                .addEdges(generateAllSynapsesBetweenFollowingLayers(neuralNetwork.getLayers()));

        return neuralNetwork
    }

}