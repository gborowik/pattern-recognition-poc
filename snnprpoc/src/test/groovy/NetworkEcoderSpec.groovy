package com.snnprpoc.main

import com.snnprpoc.model.NeuralNetworkSpec

class NetworkEncoderSpec extends NeuralNetworkSpec {


    def "Test network encoding"() {
        NeuralNetwork neuralNetwork = createNetwork(1, 1, 1)

        List<List<List<Integer>>> expectedOutput = new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList(
                        new ArrayList<>(Arrays.asList(
                                0d, 1d, 1d, 1d, 0d, 1d, 0d, 0d, 0d, 1d, 1d, 0d, 0d, 0d, 1d, 1d, 0d, 0d, 0d, 1d, 0d, 1d, 1d, 1d, 0d)
                        ),
                        new ArrayList<>(Arrays.asList(1d))
                )),
                new ArrayList<>(Arrays.asList(
                        new ArrayList<>(Arrays.asList(
                                1d, 0d, 0d, 0d, 1d, 0d, 1d, 0d, 1d, 0d, 0d, 0d, 1d, 0d, 0d, 0d, 1d, 0d, 1d, 0d, 1d, 0d, 0d, 0d, 1d)
                        ),
                        new ArrayList<>(Arrays.asList(0d))
                ))
        ));

        List<List<List<Double>>> encoded = neuralNetwork.encoder(Constants.inputData);

        expect:

        //equality
        encoded.flatten().containsAll(expectedOutput.flatten())
        expectedOutput.flatten().containsAll(encoded.flatten())

    }


}