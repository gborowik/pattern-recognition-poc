package com.prpoc.main;

import java.util.Set;

public abstract class Network {

    protected Set<Node> nodes;

    protected Set<Layer> layers;

    protected Set<DirectedEdge> directedEdges;

    public abstract String toString();

}
