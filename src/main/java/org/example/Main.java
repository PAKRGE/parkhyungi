package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        while (true) {
            System.out.println("입력해주세요.");

            try {
                Shape userShape = Shape.valueOf(SCANNER.next());
                Shape computerShape = Shape.valueOf(RANDOM.nextInt(3));
                System.out.println("나    : " + userShape);
                System.out.println("컴퓨터 : " + computerShape);

                System.out.println(userShape.compare(computerShape));
            } catch (IllegalArgumentException e) {
                System.out.println("다시 입력해주세요.");
            }
        }
    }
}