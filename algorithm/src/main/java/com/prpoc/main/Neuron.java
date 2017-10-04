package com.prpoc.main;

import static com.prpoc.main.Constants.defaultFireThreshold;

public class Neuron extends Node<Synapse> {

    private Double fireThreshold;

    Double chargeLevel;

    public void reset() {
        fireThreshold = defaultFireThreshold;
        chargeLevel = 0.0;
    }

    Double value;

    public void tick() {
        if (chargeLevel >= fireThreshold) {
            in.stream().forEach(synapse -> synapse.fire(value)); //update value -> function
        }
        chargeLevel = 0.0;
    }

    public Neuron charge(Double value){
        chargeLevel += value;
        return this;
    }

}
