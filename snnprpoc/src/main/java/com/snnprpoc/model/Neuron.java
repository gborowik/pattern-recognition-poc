package com.snnprpoc.model;

import com.snnprpoc.graph.Node;

import java.util.List;
import java.util.stream.Collectors;

import static com.snnprpoc.main.Constants.defaultFireThreshold;

public class Neuron extends Node<Synapse> {

    private Double fireThreshold;
    private Double chargeLevel;

    public Neuron(Integer id) {
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

    public Neuron charge(Double value) {
        chargeLevel += value;
        return this;
    }

    public Neuron spike(Double val) {

        return this;
    }

    public Integer getId(){
        return this.id;
    }

    @Override
    public String toString() {
        return "\n" +
                "[neuronId: "
                + id.toString()
                + " chargeLevel: " + chargeLevel.toString()
                + " fireThreshold: " + fireThreshold.toString()
                + "]"
                + "\n[in: "
                + String.join(", ", in.stream().map(el -> el.getWeight().toString()).collect(Collectors.toList()))
                + "]"
                + "\n[out: "
                + String.join(", ", out.stream().map(el -> el.getWeight().toString()).collect(Collectors.toList()))
                + "]"
                ;
    }

}
