package org.example;

import java.util.Random;

public class Car {
    Random random = new Random();
    static  int[] moveCount;

    public String[] createCar(String carInput) {
        moveCount = new int[carInput.split(",").length];
        return carInput.split(",");
    }

    public String[] moveCar(String[] carName, String[] advenceResult) {
        for (int i = 0; i < carName.length; i++) {
            int advenceCond = random.nextInt(10);

            if(advenceResult[i] == null) {
                advenceResult[i] = "";
            }
            if (advenceCond > 3) {
                advenceResult[i] = advenceResult[i] + "-";

                moveCount[i] =  moveCount[i] + 1;
            }
        }

        return advenceResult;
    }

}
