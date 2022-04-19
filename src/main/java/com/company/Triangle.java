package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Triangle implements Shape {
    private double a;
    private double b;
    private double c;
    private double field;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double readData() {
        return 0;
    }

    @Override
    public double calculation() {
        if (a < 0 || b < 0 || c < 0) {
            throw new RuntimeException("halo");
        }

        if (a > b + c) {
            throw new RuntimeException("SIEMA");
        } else if (b > a + c) {
            throw new RuntimeException("SIEMA");
        } else if (c > a + b) {
            throw new RuntimeException("SIEMA");
        }


        field = (a + b + c) * 0.5;

        return field;

    }

    @Override
    public double display() {
        System.out.println("your a = " + a);
        System.out.println("your b = " + b);
        System.out.println("your c = " + c);
        System.out.print("field = ");
        return field;
    }
}
