package com.snnprpoc.model;

import com.snnprpoc.graph.DirectedEdge;

import static com.snnprpoc.main.Constants.defaultSynapseWeight;

public class Synapse extends DirectedEdge<Neuron> {

    private double weight = defaultSynapseWeight;

    public Synapse(Neuron origin, Neuron end) {
        super(origin, end);
    }

    public Synapse(Neuron origin, Neuron end, double weight) {
        super(origin, end);
        this.weight = weight;
    }

    public Synapse setWeight(double weight) {
        this.weight = weight;
        return this;
    }

    public double getWeight() {
        return weight;
    }

    public Synapse fire(double value) {
        end.charge(value * weight);
        return this;
    }

    @Override
    public String toString() {
        return origin + " - " + end + ", weight: " + weight;
    }
}
