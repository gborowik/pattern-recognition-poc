package com.prpoc.graph;

import java.util.Collection;

public interface NetworkFactory<T, E> {

    public abstract Collection<E> generateAllSynapsesBetweenLayers(Layer<T> layer1, Layer<T> layer2);

    public abstract Collection<E> generateAllSynapsesBetweenLayerAndNode(Layer<T> layer, T node);

    public abstract Collection<E> generateAllSynapsesBetweenNodeAndLayer(T node, Layer<T> layer);

}
