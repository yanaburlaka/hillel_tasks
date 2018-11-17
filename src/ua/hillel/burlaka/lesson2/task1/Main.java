package ua.hillel.burlaka.lesson2.task1;

public class Main {

    public static void main(String[] args) {
        int size = 10;
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 101);
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
