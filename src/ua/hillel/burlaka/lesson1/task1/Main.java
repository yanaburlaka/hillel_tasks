package ua.hillel.burlaka.lesson1.task1;

public class Main {

    public static void ShowString(String inputSting) {
        System.out.println(inputSting);
    }

    public static void main(String[] args) {
        String newLine = System.getProperty("line.separator");
        String name = "***     ***" + newLine +
                " ***   *** " + newLine +
                "  *** ***  " + newLine +
                "   *****   " + newLine +
                "    ***    " + newLine +
                "    ***    " + newLine +
                "    ***    ";
        ShowString(name);
    }
}