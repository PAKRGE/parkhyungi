package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //가위 바위 보 게임 만들기.
        while (true) {

            System.out.println("입력해주세요.");

            Scanner sc = new Scanner(System.in);
            String shape = sc.next();
            Random rd = new Random();

            int ircp = 0;
            int rcp = rd.nextInt(3);
            int re = 0;

            System.out.println("나 : " + shape);

            switch (shape) {
                case "가위" -> {
                    ircp = 0;
                    re = ircp - rcp;
                }
                case "바위" -> {
                    ircp = 1;
                    re = ircp - rcp;
                }
                case "보" -> {
                    ircp = 2;
                    re = ircp - rcp;
                }
                default -> {
                    System.out.println("다시입력해주세요!");
                    continue;
                }
            }


            switch (rcp) {
                case 0 -> System.out.println("상대 : 가위");
                case 1 -> System.out.println("상대 : 바위");
                case 2 -> System.out.println("상대 : 보");
            }

            // 가위 -1 -2  -2 -1
            // 바위 -1 1   1 0
            // 보 2 1
            switch (re) {
                case 0 -> System.out.println("비겼습니다.");
                case -1, 2 -> System.out.println("졌습니다.");
                case -2, 1 -> System.out.println("이겼습니다.");
            }
        }
    }
}