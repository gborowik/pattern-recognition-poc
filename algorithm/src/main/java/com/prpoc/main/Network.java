package com.prpoc.main;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public abstract class Network {

    protected Set<Node<?>> nodes = new HashSet<>();

    protected Set<Node<?>> inNodes = new HashSet<>();

    protected Set<Node<?>> outNodes = new HashSet<>();

    protected Set<DirectedEdge<?>> directedEdges = new HashSet<>();

    protected Set<Layer> layers = new HashSet<>();


    public void addNode(Node<?> node) {
        nodes.add(node);
    }

    public void addNodes(Collection<Node<?>> ns) {
        nodes.addAll(ns);
    }

    public void addInputNode(Node<?> node) {
        inNodes.add(node);
    }

    public void addInputNodes(Collection<Node<?>> ns) {
        inNodes.addAll(ns);
    }

    public void addOutputNode(Node<?> node) {
        outNodes.add(node);
    }

    public void addOutputNodes(Collection<Node<?>> ns) {
        outNodes.addAll(ns);
    }

    public void addEdge(DirectedEdge<?> edge) {
        directedEdges.add(edge);
    }

    public void addEdges(Collection<DirectedEdge<?>> es) {
        directedEdges.addAll(es);
    }

    public void addLayer(Layer layer) {
        layers.add(layer);
    }

    public void addLayers(Collection<Layer> ls) {
        layers.addAll(ls);
    }


    public abstract String toString();

}
