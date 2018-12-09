package ua.hillel.burlaka.lesson2.tasksFrom4to10;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static int scanInput() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int getValue = reader.nextInt();
        return getValue;
    }

    // task number 4 (divide by 3) and 5 (even numbers)

    public static IntStream divideByWithoutRemainder(int[] array, int divider) {
        IntStream stream = IntStream.of(array).filter(x -> (x % divider) == 0);
        return stream;
    }

    // task number 6

    public static int sumOfArrayElements(int[] array) {
        int sumOfElements = IntStream.of(array).sum();
        return sumOfElements;
    }

    //task number 7

    public static double meanOfArrayElements(int[] array, int sum) {
        double meanOfElements = sum / array.length;
        return meanOfElements;
    }

    //task number 8

    public static int minElement(int[] array) {
        int min = IntStream.of(array).min().getAsInt();
        return min;
    }

    public static int maxElement(int[] array) {
        int max = IntStream.of(array).max().getAsInt();
        return max;
    }

    // task number 9

    public static int compositionOfNonEvenElements(int[] array) {
        int composition = IntStream.of(array).filter(i -> (i % 2 == 1)).reduce(1, (a, b) -> a * b);
        return composition;
    }

    // task number 10

    public static int checkPositionOfElement(int[] array, int value){
        int position = IntStream.of(array).filter(i -> array[i] == value).findFirst().getAsInt();
        return position += 1;
    }

    public static void main(String[] args) {
        String newLine = System.getProperty("line.separator");
        int sum, min, max, compose, place = 0;
        int divider1 = 3;
        int divider2 = 2;
        double mean = 0;
        int n = scanInput();
        IntStream stream = IntStream.range(0, n).map(i -> i + 1);
        int[] array = stream.toArray();
        System.out.println(newLine + "You have the following array:");
        Arrays.stream(array).forEach(System.out::println);

        System.out.println(newLine + newLine + "Results of 4th task:");
        IntStream stream4 = divideByWithoutRemainder(array, divider1); //task number 4
        System.out.println("Elements which are divided by " + divider1 + " without remainder:");
        stream4.forEach(System.out::println);

        System.out.println(newLine + "Results of 5th task:");
        IntStream stream5 = divideByWithoutRemainder(array, divider2); //task number 5
        System.out.println("Elements which are divided by " + divider2 + " without remainder:");
        stream5.forEach(System.out::println);

        System.out.println(newLine + "Results of 6th task:");
        sum = sumOfArrayElements(array); // task number 6
        System.out.println("Sum of array elements:");
        System.out.println(sum);

        System.out.println(newLine + "Results of 7th task:");
        mean = meanOfArrayElements(array, sum);
        System.out.println("Mean of array elements:");
        System.out.println(mean);

        System.out.println(newLine + "Results of 8th task:");
        min = minElement(array);
        System.out.println("Min of array elements:");
        System.out.println(min);
        max = maxElement(array);
        System.out.println("Max of array elements:");
        System.out.println(max);

        System.out.println(newLine + "Results of 9th task:");
        compose = compositionOfNonEvenElements(array);
        System.out.println(compose);

        System.out.println(newLine + "Results of 10th task:");
        place = checkPositionOfElement(array, scanInput());
        System.out.println("Element with this value is on " + place + " position.");
    }
}
