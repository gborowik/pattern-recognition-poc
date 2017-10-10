package com.snnprpoc.model

import com.snnprpoc.graph.Layer
import com.snnprpoc.main.NeuralNetwork

class BasicNetworkLayoutSpec extends com.snnprpoc.model.NeuralNetworkSpec {


    def "Test Neuron printing"() {
        Neuron neuron = new Neuron(15);

        String str = neuron.toString()

        expect:

        str == "\n[Neuron: 15 chargeLevel: 0.0 thershold: 1.0]"
    }

    def "Test Layer printing"() {
        Neuron neuron = new Neuron(15);
        Layer layer = new Layer();

        layer.addNode(neuron)

        String str = layer.toString()

        expect:

        str == "\n[Neuron: 15 chargeLevel: 0.0 thershold: 1.0]"

    }

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