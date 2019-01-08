package ua.hillel.burlaka.lesson5;

import java.util.Scanner;

public class Task {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first Real Number:");
        int numberOne = scanner.nextInt();
        System.out.println("Enter second Real Number:");
        int numberTwo = scanner.nextInt();
        Complex complex = new Complex(numberOne, numberTwo);
        System.out.println(complex);
        System.out.println(complex.getRealNumber1());


        Complex complex2 = new Complex(3, 4);
        System.out.println(complex.toString() + " + " + complex2.toString() +
                " = " + complex.plus(complex2));
        System.out.println(complex.toString() + " - " + complex2.toString() +
                " = " + complex.minus(complex2));
        System.out.println(complex.toString() + " * " + complex2.toString() +
                " = " + complex.compose(complex2));
        if (complex2.getRealNumber1() == 0 && complex2.getRealNumber2() == 0) {
            System.out.println(complex.toString() + " / " + complex2.toString() +
                    " = " + "We can't do it");
        } else {
            System.out.println(complex.toString() + " / " + complex2.toString() +
                    " = " + complex.divide(complex2));
        }
        int result = complex.compareTo(complex2);
        if (result == 1) {
            System.out.println(complex.toString() + " > " + complex2.toString());
        } else if (result == -1) {
            System.out.println(complex.toString() + " < " + complex2.toString());
        } else {
            System.out.println(complex.toString() + " = " + complex2.toString());
        }

    }
}

