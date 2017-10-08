package com.snnprpoc.model

import com.snnprpoc.main.NeuralNetwork
import spock.lang.Specification

import static com.snnprpoc.model.helper.NeuralNetworkFactory.generateAllSynapsesBetweenFollowingLayers
import static com.snnprpoc.model.helper.NeuralNetworkFactory.makeLayerOfSize


public class NeuralNetworkSpec extends Specification {


    def "Test basic network layout"() {
        int inputLayerSize = 20
        int hiddenLayerSize = 5
        int outputLayerSize = 2
        NeuralNetwork neuralNetwork = createNetwork(inputLayerSize, hiddenLayerSize, outputLayerSize)

        expect:

        neuralNetwork.getLayers().size() == 3
        neuralNetwork.getFirstLayer().getNodes().size() == inputLayerSize
        neuralNetwork.getLayer(1).getNodes().size() == hiddenLayerSize
        neuralNetwork.getLastLayer().getNodes().size() == outputLayerSize

    }


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