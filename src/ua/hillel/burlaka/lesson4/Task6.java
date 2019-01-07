package ua.hillel.burlaka.lesson4;

import java.util.Arrays;
import java.util.Random;

public class Task6 {

    public static void main(String[] args) {
        int limit = 20;
        Random random = new Random();
        int[] array = random.ints(0,20).limit(limit).toArray();
        Arrays.stream(array).forEach(x -> System.out.print(x + " "));
        sortMyArray(array);
        System.out.println();
        System.out.println("AFTER SORTING");
        Arrays.stream(array).forEach(x -> System.out.print(x + " "));
    }

    private static void sortMyArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
