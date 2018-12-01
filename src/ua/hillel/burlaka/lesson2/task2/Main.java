package ua.hillel.burlaka.lesson2.task2;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

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
        IntStream.range(0, n).forEach(i -> array[i] = i + 1);
        Arrays.stream(array, 0, array.length).forEach(x -> System.out.println(x));
    }
}