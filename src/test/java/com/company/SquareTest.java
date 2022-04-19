package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SquareTest {

    @Test
    void test() {
        //GIVEN
        Square square = new Square(10, 10);

        //WHEN
        double calculation = square.calculation();

        //THEN
        assertEquals(100, calculation);
    }

    @Test
    void test1() {
        //GIVEN
        Square square = new Square(-10, 10);

        //WHEN
        //THEN
        assertThrows(RuntimeException.class, square::calculation);
    }
}