package com.akadatsky.model;

public class Soldier extends MovableUnit {

    public Soldier(int x, int y) {
        super(x, y);
    }

    public void fire() {
        System.out.println("fire");
    }

    public void playGuitar() {
        System.out.println("playing guitar...");
    }

    @Override
    public String toString() {
        return "Soldier{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
