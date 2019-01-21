package ua.hillel.burlaka.lesson5;

import java.util.Arrays;
import java.util.Random;

public class Task2 {

    public static void main(String[] args) {

        Complex[] arrayComplex1 = new Complex[10];
        fillIn(arrayComplex1);
        sortElements(arrayComplex1);
        Arrays.stream(arrayComplex1).forEach(System.out::println);
        System.out.println("******************");
        Complex[] arrayComplex2 = new Complex[10];
        fillIn(arrayComplex2);
        sortElements(arrayComplex2);
        Arrays.stream(arrayComplex2).forEach(System.out::println);

    }

    private static void fillIn(Complex[] arrayComplex1) {
        float leftLimit = -100F;
        float rightLimit = 100F;
        for (int i = 0; i < arrayComplex1.length; i++) {
            float realNumber1 = leftLimit + new Random().nextFloat() * (rightLimit - leftLimit);
            float realNumber2 = leftLimit + new Random().nextFloat() * (rightLimit - leftLimit);
            arrayComplex1[i] = new Complex(realNumber1, realNumber2);
        }
    }

    static void sortElements(Complex[] arrayComplex1) {
        for (int i = 0; i < arrayComplex1.length; i++) {
            for (int j = 0; j < arrayComplex1.length - i - 1; j++) {
                if (arrayComplex1[j].compareTo(arrayComplex1[j+1]) == 1) {
                    Complex temp = arrayComplex1[j];
                    arrayComplex1[j] = arrayComplex1[j + 1];
                    arrayComplex1[j + 1] = temp;
                }
            }
        }
    }
}
