package ua.hillel.burlaka.lesson4.task5;

import java.util.Scanner;

public class TAsk5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter limit for Fibonacci numbers:");
        int limit = scanner.nextInt();
        int number = 0;
        int b = 1;
        System.out.println(number);
        while (number <= limit) {
            int prev = number;
            number = number + b;
            b = prev;
            if (number <= limit) {
                System.out.println(number);
            }
            else {
                System.out.println("Finish");
            }
        }
    }
}

