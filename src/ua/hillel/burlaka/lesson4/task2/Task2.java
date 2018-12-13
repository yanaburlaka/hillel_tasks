package ua.hillel.burlaka.lesson4.task2;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter limit number:");
        int limit = reader.nextInt();
        int counter;
        for (int i = 1; i < limit; i++) {
            counter = 1;
            for (int j = 1; j < i; j++) {
                if ((i % j) == 0) {
                    counter++;
                }
            }
            if (counter <= 2) {
                System.out.println(i);
            }
        }
    }
}
