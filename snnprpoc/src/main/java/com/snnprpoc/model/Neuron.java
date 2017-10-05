package com.snnprpoc.model;

import com.snnprpoc.graph.Node;

import static com.snnprpoc.main.Constants.defaultFireThreshold;

public class Neuron extends Node<Synapse> {

    private Double fireThreshold;
    private Double chargeLevel;

    public Neuron(Integer id){
        this.id = id;
        reset();
    }

    public void reset() {
        fireThreshold = defaultFireThreshold;
        chargeLevel = 0.0;
    }

    public void tick() {
        if (chargeLevel >= fireThreshold) {
            in.forEach(synapse -> synapse.fire(0.0)); //update value -> function
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
