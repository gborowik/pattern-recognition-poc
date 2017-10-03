package com.prpoc.main;

import static com.prpoc.main.Constants.defaultFireThreshold;

public class Neuron extends Node<Synapse> {

    private Double fireThreshold;

    Double charge;

    public void reset() {
        fireThreshold = defaultFireThreshold;
        charge = 0.0;
    }

    Double value;

    public void tick() {
        if (charge >= fireThreshold) {
            in.stream().forEach(synapse -> synapse.fire(value)); //update value -> function
        }
        charge = 0.0;
    }

    public Neuron charge(Double value){
        charge += value;
        return this;
    }

}
