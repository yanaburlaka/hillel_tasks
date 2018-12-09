package ua.hillel.burlaka.lesson2.task3;
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
        if (n == 0) {
            System.out.println("Size is zero");
        }
        else if (n == 1){
            array[0] = n;
        }
        else {
            IntStream stream = IntStream.rangeClosed(1, n).map(i -> n + 1 - i);
            array = stream.toArray();
            Arrays.stream(array).forEach(System.out::println);
        }
    }
}
