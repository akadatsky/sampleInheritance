package com.akadatsky.model;

public class Unit {

    protected int x;
    protected int y;
    protected boolean destructible = true;

    public Unit(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw() {
        System.out.println("drawing...");
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isDestructible() {
        return destructible;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
