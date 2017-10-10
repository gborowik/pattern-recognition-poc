package com.snnprpoc.graph;

import java.util.*;
import java.util.stream.Collectors;


public class Layer<T> {

    protected List<T> nodes = new ArrayList<>();
    protected Integer id;

    public Layer(Integer id) {
        this.id = id;
    }

    public Layer(Integer id, Collection<T> ns) {
        this(id);
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
        return "\nLayer: "
                + id.toString()
                + String.join("\n", nodes.stream().map(node -> node.toString()).collect(Collectors.toList()));
    }
}
