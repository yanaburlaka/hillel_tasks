package ua.hillel.burlaka.lesson3.task4;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("How much do you want to put on deposit?");
        double deposit = reader.nextInt();

        System.out.println("How much do you want to add every month?");
        double monthSum = reader.nextInt();

        System.out.println("Enter deposit interest rate of your bank:");
        double percentRate = reader.nextDouble();

        System.out.println("How old are you?");
        int currentAge = reader.nextInt();

        System.out.println("Enter retirement age please:");
        int retirementAge = reader.nextInt();

        for (int i = currentAge; i < retirementAge; i++) {
            for (int j = 0; j < 12; j++) {
                deposit = deposit + Math.round((deposit * percentRate/ 100 / 12) * 100 / 100);
                if ((i == retirementAge - 1) & (j == 11)) {
                } else {
                    deposit += monthSum;
                }
            }
        }
        System.out.print("YOU'LL GET ");
        System.out.printf("Value: %.2f", deposit);
    }
}
