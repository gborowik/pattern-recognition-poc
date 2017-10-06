package com.snnprpoc.graph;

import java.util.*;

public class Layer<T> {

    protected List<T> nodes = new ArrayList<>();

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

    public List<T> getNodes() {
        return nodes;
    }

    public String toString() {
        return null;
    }
}
