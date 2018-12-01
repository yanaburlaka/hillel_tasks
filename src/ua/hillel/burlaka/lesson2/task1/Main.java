package ua.hillel.burlaka.lesson2.task1;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static int[] setAndSeeArray(int arraySize) {
        int[] array = new Random().ints(arraySize, 0, 100).toArray();
        return array;
    }

    public static void main(String[] args) {
        int size = 10;
        int limit = 5;
        Arrays.stream(setAndSeeArray(size)).limit(limit).forEach(x-> System.out.println(x));
    }
}