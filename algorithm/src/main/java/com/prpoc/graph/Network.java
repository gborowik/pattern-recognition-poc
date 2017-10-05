package com.prpoc.graph;

import java.util.*;

public abstract class Network<T, E> {

    protected Set<T> nodes = new HashSet<>();

    protected Set<T> inNodes = new HashSet<>();

    protected Set<T> outNodes = new HashSet<>();

    protected Set<E> directedEdges = new HashSet<>();

    protected List<Layer<T>> layers = new ArrayList<>();


    public void addNode(T node) {
        nodes.add(node);
    }

    public void addNodes(Collection<T> ns) {
        nodes.addAll(ns);
    }

    public void addInputNode(T node) {
        inNodes.add(node);
    }

    public void addInputNodes(Collection<T> ns) {
        inNodes.addAll(ns);
    }

    public void addOutputNode(T node) {
        outNodes.add(node);
    }

    public void addOutputNodes(Collection<T> ns) {
        outNodes.addAll(ns);
    }

    public void addEdge(E edge) {
        directedEdges.add(edge);
    }

    public void addEdges(Collection<E> es) {
        directedEdges.addAll(es);
    }

    public void addLayer(Layer<T> layer) {
        layers.add(layer);
    }

    public void addLayers(Collection<Layer<T>> ls) {
        layers.addAll(ls);
    }


    public abstract String toString();

}
