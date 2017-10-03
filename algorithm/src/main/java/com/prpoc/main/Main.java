package com.prpoc.main;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Grzegorz Borowik on 2017-10-03 10:11 AM.
 * e-mail: borowik.grzegorz@gmail.com
 */

public class Main {

    class Neuron {
        double voltage;

    }

    class Synapse extends Pair<Neuron, Neuron> {

        double weight;

        public Synapse(Neuron first, Neuron second) {
            super(first, second);
        }

        public void updateWeight() {

        }

    }

    List<Integer> properImage = new ArrayList<>(Arrays.asList
            (0, 1, 1, 1, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0));

    List<Integer> wrongImage = new ArrayList<>(Arrays.asList
            (1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1));

    List<Neuron> inputNeurons = new ArrayList<>();
    List<Neuron> outputNeurons = new ArrayList<>();

    List<Synapse> synapses = new ArrayList<>();

    Integer tick;


    public static void main(String[] args) {

    }


}