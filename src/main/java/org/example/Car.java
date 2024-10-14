package org.example;

import java.util.Random;

public class Car {
    private final String carName;
    private int moveCount;

    public Car(String carName, int moveCount) {
        this.carName = carName;
        this.moveCount = moveCount;
    }

    public String getCarName() {
        return carName;
    }

    public int getMoveCount() {
        return moveCount;
    }

    public void isMove() {
        moveCount++;
    }

}



