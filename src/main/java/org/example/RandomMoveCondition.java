package org.example;

import java.util.Random;

public class RandomMoveCondition implements MoveCondition {
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
