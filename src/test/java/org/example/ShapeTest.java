package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ShapeTest {
    @Test
    void 가위는_보를_이긴다() {
        Shape 가위 = Shape.가위;
        Shape 보 = Shape.보;

        Shape.CompareResult result = 가위.compare(보);
        Assertions.assertEquals(result, Shape.CompareResult.이김);
    }

    @Test
    void 가위는_가위한테_비긴다() {
        Shape 가위1 = Shape.가위;
        Shape 가위2 = Shape.가위;

        Shape.CompareResult result = 가위1.compare(가위2);
        Assertions.assertEquals(result, Shape.CompareResult.비김);
    }

    @Test
    void 가위는_바위한테_진다() {
        Shape 가위 = Shape.가위;
        Shape 바위 = Shape.바위;

        Shape.CompareResult result = 가위.compare(바위);
        Assertions.assertEquals(result, Shape.CompareResult.짐);
    }

    @Test
    void 잘못된_숫자가_입력되면_예외가_발생한다() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Shape.valueOf(5));
    }
}