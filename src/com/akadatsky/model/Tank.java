package com.akadatsky.model;

public class Tank extends MovableUnit {

    public Tank(int x, int y) {
        super(x, y);
    }

    public void fire() {
        System.out.println("fire");
    }

    public void reload() {
        System.out.println("reload");
    }

    @Override
    public String toString() {
        return "Tank{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
