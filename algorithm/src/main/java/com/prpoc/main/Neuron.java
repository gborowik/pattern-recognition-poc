package com.prpoc.main;

import static com.prpoc.main.Constants.defaultFireThreshold;

public class Neuron extends Node<Synapse> {

    private double fireThreshold;

    double charge;

    public void reset() {
        fireThreshold = defaultFireThreshold;
        charge = 0.0;
    }

    double value;

    public void tick() {
        if (charge >= fireThreshold) {
            in.stream().forEach(synapse -> synapse.fire(value));
        }
        charge = 0.0;
    }

    public Neuron charge(double value){
        charge += value;
        return this;
    }

}
