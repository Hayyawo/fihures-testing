package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TriangleTest {
//testtejhmnkj

//    @Test
//    void test(){
//        //Given
//        Triangle triangle = new Triangle(10, 10);
//        //When
//        double calculation = triangle.calculation();
//
//        //Then
//        assertEquals(50,calculation);
//
//    }
//
//    @Test
//    void test1(){
//        //GIVEN
//        Triangle triangle = new Triangle(-10,2);
//
//        //WHEN
//        //THEN
//        assertThrows(RuntimeException.class, triangle::calculation);
//    }


    //czy bok ujemny
    @Test
    void test3() {
        //GIVEN
        Triangle triangle = new Triangle(11, 12, -12);
        //THEN


        //WHEN
        assertThrows(RuntimeException.class, triangle::calculation);

    }

    @Test
    void test4() {
        //GIVEN
        Triangle triangle = new Triangle(100, 5, 5);
        //THEN



        //WHEN
        assertThrows(RuntimeException.class, triangle::calculation);

    }
}
