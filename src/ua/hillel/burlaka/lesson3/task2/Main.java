package ua.hillel.burlaka.lesson3.task2;

import java.util.Scanner;

public class Main {

    public static int countSymbol(String someString, char symbol) {
        int counter = 0;
        for (int i = 0; i < someString.length(); i++) {
            if (someString.charAt(i) == symbol) {
                counter++;
            }
        }
        return counter;
    }

    public static int scanInput() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter decimal: ");
        int getValue = reader.nextInt();
        reader.close();
        return getValue;
    }

    public static int useMethod(int n) {
        int counter = 0;
        int number = n;
        while (number > 1) {
            if (number % 2 == 1) {
                counter++;
            }
            number = number / 2;
        }
        if (number == 1) {
            counter++;
        }
        return counter;
    }

    public static void main(String[] args) {
        int userInput = scanInput();
        String binaryString = Integer.toBinaryString(userInput);
        int result1 = countSymbol(binaryString, '1');
        System.out.println("Using toBinaryString() method: " + result1);
        int result2 = useMethod(userInput);
        System.out.println("Using own method: " + result2);
    }
}
