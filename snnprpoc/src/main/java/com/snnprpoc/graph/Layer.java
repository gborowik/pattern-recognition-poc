package com.snnprpoc.graph;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Layer<T> {

    protected Set<T> nodes = new HashSet<>();

    public Layer(Collection<T> ns) {
        this.nodes.addAll(ns);
    }

    public Layer<T> addNode(T node) {
        nodes.add(node);
        return this;
    }

    public Layer<T> addNodes(Collection<T> ns) {
        nodes.addAll(ns);
        return this;
    }

    public Set<T> getNodes() {
        return nodes;
    }

    public String toString() {
        return null;
    }
}
