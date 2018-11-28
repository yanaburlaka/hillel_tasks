package ua.hillel.burlaka.lesson2.task1;

public class Main {

    public static void setAndSeeArray (int[] array, int limit) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 101);
        }
        for (int i = 0; i < limit; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        int size = 10;
        int[] array = new int[size];
        setAndSeeArray(array, 5);
    }
}
