package com.prpoc.main;

public abstract class DirectedEdge<T> {
    public T origin;
    public T end;

    public DirectedEdge(T origin, T end) {
        this.origin = origin;
        this.end = end;
    }
}
