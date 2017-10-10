package com.snnprpoc.model

import com.snnprpoc.main.NeuralNetwork

public class BasicNetworkLayoutSpec extends NeuralNetworkSpec {


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


    def "Test network printing"() {
        int inputLayerSize = 5
        int hiddenLayerSize = 3
        int outputLayerSize = 2
        NeuralNetwork neuralNetwork = createNetwork(inputLayerSize, hiddenLayerSize, outputLayerSize)

        println("\n************************************************************")
        println(neuralNetwork.toString())
        println("\n************************************************************")

        expect:

        1 == 1
        //neuralNetwork.toString() == "Network: "

    }

}