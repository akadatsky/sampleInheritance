package com.akadatsky;

import com.akadatsky.model.Fence;
import com.akadatsky.model.MovableUnit;
import com.akadatsky.model.Soldier;
import com.akadatsky.model.Tank;
import com.akadatsky.model.Tower;
import com.akadatsky.model.Unit;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Soldier soldier = new Soldier(3, 4);
        Tank tank = new Tank(10, 20);

        List<Unit> units = new ArrayList<>();
        units.add(soldier);
        units.add(tank);
        units.add(new Fence(4, 5));
        units.add(new Tower(5, 6));

        System.out.println(units);
        drawAll(units);
        moveAll(units);
        System.out.println(units);
    }

    private static void moveAll(List<Unit> units) {
        for (Unit unit : units) {
            if (unit instanceof MovableUnit) {
                MovableUnit movableUnit = (MovableUnit) unit;
                movableUnit.move();
            }
        }
    }

    private static void drawAll(List<Unit> units) {
        for (Unit unit : units) {
            unit.draw();
        }
    }
}
