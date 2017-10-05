package com.prpoc.main;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public abstract class Layer {

    protected Set<Node<?>> nodes = new HashSet<>();


    public void addNode(Node<?> node) {
        nodes.add(node);
    }

    public void addNodes(Collection<Node<?>> ns) {
        nodes.addAll(ns);
    }


    public abstract String toString();
}
