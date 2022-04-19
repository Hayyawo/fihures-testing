package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        System.out.print("set your a ");
//        double a = sc.nextInt();
//
//        System.out.print("set your b ");
//        double b = sc.nextInt();

//        Square square = new Square(a,b);
//
//        System.out.println(square.calculation());
//        System.out.println(square.display());

        System.out.print("set your a ");
        double a = sc.nextInt();

        System.out.print("set your h ");
        double h = sc.nextInt();

        System.out.print("set your c ");
        double c = sc.nextInt();
        Triangle triangle = new Triangle(a, h,c);

        System.out.println(triangle.calculation());
        System.out.println(triangle.display());
    }


}
