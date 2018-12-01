package ua.hillel.burlaka.lesson1.task2;

public class Main {

    public static int[][] setValuesAndSeeArray (int rows, int columns) {
        int[][] array = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = (int) (Math.random() * 101);
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int rows = 10;
        int columns = 10;
        int[][] resultArray = setValuesAndSeeArray(rows, columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(resultArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
