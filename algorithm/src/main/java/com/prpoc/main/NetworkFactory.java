package com.prpoc.main;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public abstract class NetworkFactory<T, E> {

    public abstract Collection<E> generateAllSynapsesBetweenLayers(Layer<T> layer1, Layer<T> layer2);

    public abstract Collection<E> generateAllSynapsesBetweenLayerAndNode(Layer<T> layer, T node);

    public abstract Collection<E> generateAllSynapsesBetweenNodeAndLayer(T node, Layer<T> layer);

}
