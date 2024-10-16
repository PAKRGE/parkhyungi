package org.example;

import java.util.Random;

public class RandomMoveCondition implements MoveCondition{
    private static final Random RANDOM = new Random();
    private final int RANDOMCONDTION = 10;

    @Override
    public boolean isMove() {
        return RANDOM.nextInt(RANDOMCONDTION) > 3;
    }
}
