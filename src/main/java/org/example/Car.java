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

interface MoveCondition {
    boolean isMove();
}

class RandomMoveCondition implements MoveCondition {
    final int randomInput = 10;
    Random RANDOM = new Random();

    @Override
    public boolean isMove() {
        int randomOutput = RANDOM.nextInt(randomInput);
        if (randomOutput > 3) {
            return true;
        } else {
            return false;
        }
    }
}
