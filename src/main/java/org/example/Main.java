package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car car = new Car();

        while (true) {
            System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
            String[] carName = car.createCar(scanner.next());
            String[] advencResult = new String[carName.length];

            System.out.println("시도할 횟수는 몇회인가요?");
            int tryNum = scanner.nextInt();

            System.out.println("실행 결과");
            int tryCount = 0;
            while (tryCount < tryNum) {

                advencResult = car.moveCar(carName, advencResult);
                int i = 0;
                while (i < carName.length) {

                    System.out.println(carName[i] + " : " + advencResult[i]);
                    i++;
                }
                System.out.println("-----------------------------");
                if (tryCount + 1 == tryNum) {
                    System.out.println();
                }
                tryCount++;

            }

            int[] moveCount = Car.moveCount;
            int maxMove = findMax(moveCount);

            List<Integer> winnerIndex = findIndex(moveCount,maxMove);
            String winner = "";

            for(int i = 0; i < winnerIndex.size(); i++) {
                if (winner.equals("")) {
                    winner = carName[winnerIndex.get(i)];
                } else {
                    winner = winner + ", " + carName[winnerIndex.get(i)];
                }
            }

            System.out.println(winner + "가 최종 우승했습니다.");

        }

    }

    public static int findMax(int[] arr) {
        int max = 0;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }

    public static List<Integer> findIndex(int[] arr, int target) {
        List<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                indexes.add(i);
            }
        }
        return indexes;
    }
}
