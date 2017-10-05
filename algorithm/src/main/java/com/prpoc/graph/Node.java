package com.prpoc.graph;

import java.util.Set;

public abstract class Node<E> {

    protected Set<E> in;
    protected Set<E> out;
    protected Integer id;

    public Set<E> addInConnection(E e){
        in.add(e);
        return in;
    }

    public Set<E> addInConnections(Set<E> ins){
        in.addAll(ins);
        return in;
    }

    public Set<E> addOutConnection(E e){
        out.add(e);
        return out;
    }

    public Set<E> addOutConnections(Set<E> outs){
        out.addAll(outs);
        return out;
    }

    public abstract String toString();
}
