package com.prpoc.graph;

import java.util.Set;

public abstract class Node<E> {

    protected Set<E> in;
    protected Set<E> out;

    public abstract String toString();
}
