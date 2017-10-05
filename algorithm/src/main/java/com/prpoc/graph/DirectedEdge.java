package com.prpoc.graph;

public class DirectedEdge<T> {
    public T origin;
    public T end;

    public DirectedEdge(T origin, T end) {
        this.origin = origin;
        this.end = end;
    }

    public String toString() {
        return null;
    }
}
