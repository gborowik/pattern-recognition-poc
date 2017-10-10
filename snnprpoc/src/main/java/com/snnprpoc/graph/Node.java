package com.snnprpoc.graph;

import java.util.HashSet;
import java.util.Set;

public class Node<E> {

    protected Set<E> in = new HashSet<>();
    protected Set<E> out = new HashSet<>();
    protected Integer id;

    public E addInConnection(E e) {
        in.add(e);
        return e;
    }

    public Set<E> addInConnections(Set<E> ins) {
        in.addAll(ins);
        return in;
    }

    public E addOutConnection(E e) {
        out.add(e);
        return e;
    }

    public Set<E> addOutConnections(Set<E> outs) {
        out.addAll(outs);
        return out;
    }

    public String toString() {
        return null;
    }
}
