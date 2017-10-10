package com.snnprpoc.main

import com.snnprpoc.model.*

public class NetworkEncoderSpec extends NeuralNetworkSpec {


    def "Test network encoding"() {
        NeuralNetwork neuralNetwork = createNetwork(inputLayerSize, hiddenLayerSize, outputLayerSize)
        List<List<List<Integer>>> inputData = new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList(
                        0, 1, 1, 1, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0)
                ),
                new ArrayList<>(Arrays.asList(1))
        ))
        List<List<List<Double>>> expectedOutput = new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList(
                        0d, 1d, 1d, 1d, 0d, 1d, 0d, 0d, 0d, 1d, 1d, 0d, 0d, 0d, 1d, 1d, 0d, 0d, 0d, 1d, 0d, 1d, 1d, 1d, 0d)
                ),
                new ArrayList<>(Arrays.asList(1d))
        ))

        List<List<List<Double>>> encoded = neuralNetwork.encoder(inputData);

        expect:

        encoded == expectedOutput

    }


}