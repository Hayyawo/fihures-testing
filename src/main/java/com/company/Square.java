package com.company;

public class Square implements Shape {
    private double a;
    private double b;

    public Square(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double readData() {
        return 0;
    }

    @Override
    public double calculation() {
        if (a < 0 || b < 0) {
            throw new RuntimeException();
        }
        return a * b;
    }

    @Override
    public double display() {
        System.out.println("Your a = " + a);
        System.out.println("Your b = " + b);
        return a * b;

    }
}
