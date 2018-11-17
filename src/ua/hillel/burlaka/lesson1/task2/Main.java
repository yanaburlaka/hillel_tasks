package ua.hillel.burlaka.lesson1.task2;

public class Main {

    public static void main(String[] args) {
        int rows = 10;
        int columns = 10;
        int[][] array = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = (int) (Math.random() * 101);
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
