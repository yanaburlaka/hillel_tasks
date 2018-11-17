package ua.hillel.burlaka.lesson2.task2;
import java.util.Scanner;

public class Main {

    public static int scanInput(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int getValue = reader.nextInt();
        reader.close();
        return getValue;
    }

    public static void main(String[] args) {
        int n = scanInput();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i + 1;
            System.out.print(array[i] + " ");
        }
    }
}