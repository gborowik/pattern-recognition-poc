package com.prpoc.main;

import com.prpoc.graph.Node;

import static com.prpoc.main.Constants.defaultFireThreshold;

public class Neuron extends Node<Synapse> {

    private Double fireThreshold;

    private Double chargeLevel;

    public void reset() {
        fireThreshold = defaultFireThreshold;
        chargeLevel = 0.0;
    }

    public void tick() {
        if (chargeLevel >= fireThreshold) {
            in.stream().forEach(synapse -> synapse.fire(0.0)); //update value -> function
        }
        chargeLevel = 0.0;
    }

    public Neuron charge(Double value){
        chargeLevel += value;
        return this;
    }

    @Override
    public String toString() {
        return null;
    }
}
