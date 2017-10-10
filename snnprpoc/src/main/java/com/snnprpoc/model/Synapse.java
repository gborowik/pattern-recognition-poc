package com.snnprpoc.model;

import com.snnprpoc.graph.DirectedEdge;

import static com.snnprpoc.main.Constants.defaultSynapseWeight;

public class Synapse extends DirectedEdge<Neuron> {

    private Double weight;

    public Synapse(Neuron origin, Neuron end) {
        super(origin, end);
        weight = defaultSynapseWeight;
    }

    public Synapse(Neuron origin, Neuron end, Double weight) {
        super(origin, end);
        this.weight = weight;
    }

    public Synapse setWeight(Double weight) {
        this.weight = weight;
        return this;
    }

    public Double getWeight() {
        return weight;
    }

    public Synapse fire(Double value) {
        end.charge(value * weight);
        return this;
    }

    @Override
    public String toString() {
        return "{Synapse: " + origin + " - " + end + ", weight: " + weight + "}";
    }
}
