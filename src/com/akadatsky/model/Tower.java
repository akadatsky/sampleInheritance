package com.akadatsky.model;

public class Tower extends Unit {

    public Tower(int x, int y) {
        super(x, y);
        destructible = false;
    }

    @Override
    public String toString() {
        return "Tower{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
