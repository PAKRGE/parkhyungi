package org.example;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String[] nameInput = scanner.next().split(",");

        List<Car> carList = Arrays.stream(nameInput)
                .map((String carName) -> new Car(carName,0, ""))
                .toList();

        System.out.println("시도할 회수는 몇회인가요?");
        int tryNum = scanner.nextInt();
        for(int i =0; i < tryNum; i++) {
            for (Car car : carList) {
                if (car.isMove()) {
                    car.setMoveResult("-");
                    car.moveCar();
                }
                System.out.println(car.getCarName() + " : " + car.getMoveResult());
            }
            System.out.println("==============");
        }

        int winnerMoveCount = 0;
        String winnerCarName = "";
        for(Car car : carList) {
            if(car.getMoveCount() >= winnerMoveCount) {
                winnerMoveCount = car.getMoveCount();
            }
        }
        for(Car car : carList) {
            if(car.getMoveCount() == winnerMoveCount) {
                if (winnerCarName.isEmpty()) {
                    winnerCarName = car.getCarName();
                } else {
                    winnerCarName = "%s,%s".formatted(winnerCarName, car.getCarName());
                }
            }
        }
        System.out.printf("%s가 최종 승리 하였습니다.%n", winnerCarName);
    }

}
