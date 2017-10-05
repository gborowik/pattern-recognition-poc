package com.prpoc.main;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public abstract class Layer<T> {

    protected Set<T> nodes = new HashSet<>();


    public void addNode(T node) {
        nodes.add(node);
    }

    public void addNodes(Collection<T> ns) {
        nodes.addAll(ns);
    }

    public abstract String toString();
}
