package ua.hillel.burlaka.lesson3.task3;

import java.util.Scanner;

public class Main {

    public static String scanInput() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter expression: ");
        String getValue = reader.nextLine();
        reader.close();
        return getValue;
    }

    public static void main(String[] args) {
        String userInput = scanInput();
        boolean checkResult = Util.checkExpression(userInput);
        if (checkResult) {
            System.out.println("It's a palindrome");
        } else {
            System.out.println("It's not a palindrome");
        }
    }
}
