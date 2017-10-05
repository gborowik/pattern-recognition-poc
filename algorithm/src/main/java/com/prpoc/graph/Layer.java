package com.prpoc.graph;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public abstract class Layer<T> {

    protected Set<T> nodes = new HashSet<>();

    public Layer(Collection<T> ns) {
        this.nodes.addAll(ns);
    }

    public void addNode(T node) {
        nodes.add(node);
    }

    public void addNodes(Collection<T> ns) {
        nodes.addAll(ns);
    }

    public Set<T> getNodes() {
        return nodes;
    }

    public abstract String toString();
}
