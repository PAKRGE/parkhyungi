package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
        static Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String[] nameInput = SCANNER.next().split(",");
        List<Car> carList = Arrays.stream(nameInput)
                .map((String carName) -> new Car(carName,0))
                .toList();

        System.out.println("시도할 횟수를 입력하세요.");
        int tryCount = SCANNER.nextInt();
        RandomMoveCondition randomMoveResult = new RandomMoveCondition();
        for (int i = 0; i < tryCount; i++) {
            for(Car car : carList) {
                if(randomMoveResult.isMove()) {
                    car.isMove();
                }
                System.out.printf("%s : %s%n", car.getCarName(), "-".repeat(car.getMoveCount()));
            }
            System.out.println("==============");
        }
        int winnerMoveCount = 0;
        String winnerName = "";
        for (Car car : carList) {
            if(car.getMoveCount() >= winnerMoveCount) {
                winnerMoveCount = car.getMoveCount();
                if (winnerName.isEmpty()) {
                    winnerName = car.getCarName();
                } else {
                    winnerName = "%s,%s".formatted(winnerName, car.getCarName());
                }
            }
        }
        System.out.printf("%s가 최종 우승하였습니다.%n", winnerName);
     }
}
