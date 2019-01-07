package ua.hillel.burlaka.lesson4.task4;

public class Task4 {

    public static void main(String[] args) {
        int size = 8;
        boolean check = false;
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i % 2 == 1) {
                    if (j % 2 == 1) {
                        array[i][j] = 0;
                    } else {
                        array[i][j] = 1;
                    }
                } else {
                    if (j % 2 == 1) {
                        array[i][j] = 1;
                    } else {
                        array[i][j] = 0;
                    }
                }
            }
        }
        //array[0][2] = 1;
        for (int i = 0; i < size; i++) {
            System.out.println();
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
        check = checkForDanger(array, size);
        System.out.println();
        if (check == true) {
            System.out.println("Some figures are in danger");
        } else {
            System.out.println("There is no danger");
        }
    }

    private static boolean checkForDanger(int[][] array, int size) {
        boolean check = false;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size; j++) {
                if (array[i][j] == array[i + 1][j]) {
                    check = true;
                }
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1; j++) {
                if (array[i][j] == array[i][j + 1]) {
                    check = true;
                }
            }
        }
        return check;
    }
}

