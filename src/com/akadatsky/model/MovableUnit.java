package com.akadatsky.model;

public class MovableUnit extends Unit {

    public MovableUnit(int x, int y) {
        super(x, y);
    }

    public void move() {
        x++;
        y++;
    }

}
