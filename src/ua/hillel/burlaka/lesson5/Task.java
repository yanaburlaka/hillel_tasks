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
        System.out.println(complex.plus(complex2));
        System.out.println(complex.minus(complex2));
        System.out.println(complex.compose(complex2));
        if (complex2.getRealNumber1() == 0 && complex2.getRealNumber2() == 0) {
            System.out.println("We can't do it");
        }
        else {
            System.out.println(complex.divide(complex2));
        }

    }
}

