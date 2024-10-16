package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        List<Car> carList = Arrays.stream(SCANNER.next().split(","))
                .map(Car::new)
                .toList();

        System.out.println("시도할 횟수를 입력하세요.");
        int tryNum = SCANNER.nextInt();

        round(carList,tryNum);
        winner(carList);

    }

    private static void round(List<Car> carList, int tryNum) {
        MoveCondition condition = new RandomMoveCondition();
        for (int i = 0; i < tryNum; i++) {
            for (Car carName : carList) {
                if (condition.isMove()) {
                    carName.isMove();
                }
                System.out.printf("%s : %s%n", carName.getCarName(),"-".repeat(carName.getMoveCount()));
            }
            System.out.println("==============");
        }
    }

    private static void winner(List<Car> carList) {
        int winnerMoveCount = carList.stream()
                .mapToInt(Car::getMoveCount)
                .max()
                .orElseThrow(NoSuchElementException::new);

        String winnerCars = carList.stream()
                .filter(carName -> carName.getMoveCount() == winnerMoveCount)
                .map(Car::getCarName)
                .collect(Collectors.joining(","));

        System.out.printf("%s가 최종 우승하였습니다.%n", winnerCars);
    }
}
