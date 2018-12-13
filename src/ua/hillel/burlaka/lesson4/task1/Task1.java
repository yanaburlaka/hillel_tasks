package ua.hillel.burlaka.lesson4.task1;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your array size: ");
        int arraySize = reader.nextInt();
        int[] array = new int[arraySize];
        System.out.println("Enter sorted elements of your array placing whitespace between them");
        for (int i = 0; i < arraySize; i++) {
            array[i] = reader.nextInt();
        }
        System.out.println("Done");
        System.out.println("Enter a number:");
        int number = reader.nextInt();
        int[] newArray = placeNewElement(array, number);
        Arrays.stream(newArray).forEach(System.out::println);
    }

    private static int[] placeNewElement(int[] array, int number) {
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < newArray.length - 1; i++) {
            newArray[i] = array[i];
        }
        newArray[newArray.length - 1] = number;
        int n = newArray.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (newArray[j] > newArray[j + 1]) {
                    int temp = newArray[j];
                    newArray[j] = newArray[j + 1];
                    newArray[j + 1] = temp;
                }
            }
        }
        return newArray;
    }
}
