package org.example;

public class Car {
    private final String carName;
    private int moveCount;

    public Car(String carName) {
        this.carName = carName;
        this.moveCount = 0;
    }

    public String getCarName() {
        return carName;
    }

    public int getMoveCount() {
        return moveCount;
    }

    public void move() {
        moveCount++;
    }
}
