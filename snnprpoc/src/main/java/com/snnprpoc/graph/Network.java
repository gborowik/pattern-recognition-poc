package com.snnprpoc.graph;

import java.util.*;

public class Network<T, E> {

    protected Set<T> nodes = new HashSet<>();

    protected Set<T> inNodes = new HashSet<>();

    protected Set<T> outNodes = new HashSet<>();

    protected Set<E> directedEdges = new HashSet<>();

    protected List<Layer<T>> layers = new ArrayList<>();


    public Network<T, E> addNode(T node) {
        nodes.add(node);
        return this;
    }

    public Network<T, E> addNodes(Collection<T> ns) {
        nodes.addAll(ns);
        return this;
    }

    public Network<T, E> addInputNode(T node) {
        inNodes.add(node);
        return this;
    }

    public Network<T, E> addInputNodes(Collection<T> ns) {
        inNodes.addAll(ns);
        return this;
    }

    public Network<T, E> addOutputNode(T node) {
        outNodes.add(node);
        return this;
    }

    public Network<T, E> addOutputNodes(Collection<T> ns) {
        outNodes.addAll(ns);
        return this;
    }

    public Network<T, E> addEdge(E edge) {
        directedEdges.add(edge);
        return this;
    }

    public Network<T, E> addEdges(Collection<E> es) {
        directedEdges.addAll(es);
        return this;
    }

    public Network<T, E> addLayer(Layer<T> layer) {
        layers.add(layer);
        return this;
    }

    public Network<T, E> addLayers(Collection<Layer<T>> ls) {
        layers.addAll(ls);
        return this;
    }

    public Layer<T> getLayer(Integer idx) {
        return layers.get(idx);
    }

    public List<Layer<T>> getLayers() {
        return layers;
    }

    public Layer<T> getFirstLayer() {
        return layers != null && !layers.isEmpty() ? layers.get(0) : null;
    }

    public Layer<T> getLastLayer() {
        return layers != null && !layers.isEmpty() ? layers.get(layers.size() - 1) : null;
    }

    public String toString() {
        return null;
    }
}
