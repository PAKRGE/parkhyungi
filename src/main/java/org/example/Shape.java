package org.example;

import java.util.Arrays;

public enum Shape {
    가위(0),
    바위(1),
    보(2);

    private final int number;

    Shape(int number) {
        this.number = number;
    }

    public static Shape valueOf(int number) {
        return Arrays.stream(Shape.values())
                .filter(shape -> shape.number == number)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("다시 입력해주세요."));
    }

    public CompareResult compare(Shape shape) {
        if (this == shape) {
            return CompareResult.비김;
        }
        if ((this.number + 1 % 3) == shape.number) {
            return CompareResult.짐;
        }
        return CompareResult.이김;
    }

    public enum CompareResult {
        이김,
        비김,
        짐;
    }
}
