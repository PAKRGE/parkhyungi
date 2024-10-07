package org.example;


import java.util.Random;

public class Car extends RandomMoveConditon {
    private final String carName;
    private int moveCount;
    private String moveResult;

    public Car(String carName, int moveCount, String moveResult) {
        this.carName = carName;
        this.moveCount = moveCount;
        this.moveResult = moveResult;
    }

    public void setMoveResult(String result) {
        moveResult = moveResult + result;
    }

    public String getMoveResult() {
        return moveResult;
    }

    public String getCarName() {
        return carName;
    }

    public int getMoveCount() {
        return moveCount;
    }

    public void moveCar() {
        moveCount++;
    }


}

interface MoveConditon {
    boolean isMove();
}

class RandomMoveConditon implements MoveConditon {
    private final Random RANDOM = new Random();
    final int randomInput = 10;

    @Override
    public boolean isMove() {
        if(3 < RANDOM.nextInt(randomInput)) {
            return true;
        } else {
            return false;
        }
    }
}

