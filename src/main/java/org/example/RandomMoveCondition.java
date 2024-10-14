package org.example;

import java.util.Random;

public class RandomMoveCondition implements MoveCondition {
        final int randomInput = 10;
        private final static Random RANDOM = new Random();

        @Override
        public boolean isMove() {
            return RANDOM.nextInt(randomInput) > 3;
        }
}
