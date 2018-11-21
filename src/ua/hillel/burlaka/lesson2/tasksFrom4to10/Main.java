package ua.hillel.burlaka.lesson2.tasksFrom4to10;
import java.util.Scanner;

public class Main {

        public static int scanInput() {
            Scanner reader = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int getValue = reader.nextInt();
            return getValue;
        }

        // task number 4 (divide by 3) and 5 (even numbers)

        public static void divideByWithoutRemainder(int[] array, int divider) {
            System.out.println("Elements which are divided by " + divider + " without remainder:");
            for (int i = 0; i < array.length; i++) {
                if (array[i]%divider == 0) {
                    System.out.print(array[i] + " ");
                }
            }
            System.out.println();
        }

        // task number 6

        public static int sumOfArrayElements(int[] array) {
            System.out.println("Sum of array elements:");
            int sumOfElements = 0;
            for (int i = 0; i < array.length; i++) {
                sumOfElements+=array[i];
            }
            return sumOfElements;
        }

        //task number 7

        public static double meanOfArrayElements(int[] array, int sum) {
            System.out.println("Mean of array elements:");
            double meanOfElements = sum / array.length;
            return meanOfElements;
        }

        //task number 8

        public static int minElement(int[] array) {
            int min = array[0];
            System.out.println("Min of array elements:");
            for (int i = 1; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
            }
            return min;
        }

        public static int maxElement(int[] array) {
            int max = array[0];
            System.out.println("Max of array elements:");
            for (int i = 1; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
            return max;
        }

        // task number 9

        public static int compositionOfNonEvenElements(int[] array) {
            int composition = 1;
            System.out.println("Composition of non-even array elements:");
            for (int i = 0; i < array.length; i++) {
                if (array[i]%2 == 1) {
                    composition = composition * array[i];
                }
            }
            return composition;
        }

        // task number 10

        public static void checkPositionOfElement(int[] array, int value){
            int counter = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == value) {
                    counter += 1;
                    System.out.println("Element with this value is on " + (i + 1) + " position");
                }
            }
            if (counter == 0) {
                System.out.println("There is no element with this value");
            }
        }

        public static void main(String[] args) {
            String newLine = System.getProperty("line.separator");
            int sum, min, max, compose = 0;
            double mean = 0;
            int n = scanInput();
            int[] array = new int[n];
            System.out.println(newLine + "You have the following array:");
            for (int i = 0; i < n; i++) {
                array[i] = i + 1;
                System.out.print(array[i] + " ");
            }
            System.out.println(newLine + newLine + "Results of 4th task:");
            divideByWithoutRemainder(array, 3); //task number 4
            System.out.println(newLine + "Results of 5th task:");
            divideByWithoutRemainder(array, 2); //task number 5
            System.out.println(newLine + "Results of 6th task:");
            sum = sumOfArrayElements(array); // task number 6
            System.out.println(sum);
            System.out.println(newLine + "Results of 7th task:");
            mean = meanOfArrayElements(array, sum);
            System.out.println(mean);
            System.out.println(newLine + "Results of 8th task:");
            min = minElement(array);
            System.out.println(min);
            max = maxElement(array);
            System.out.println(max);
            System.out.println(newLine + "Results of 9th task:");
            compose = compositionOfNonEvenElements(array);
            System.out.println(compose);
            System.out.println(newLine + "Results of 10th task:");
            checkPositionOfElement(array, scanInput());
        }
}
