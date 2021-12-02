package com.akadatsky.model;

public class Fence extends Unit {
    public Fence(int x, int y) {
        super(x, y);
    }

    @Override
    public String toString() {
        return "Fence{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
