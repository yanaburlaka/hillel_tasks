package ua.hillel.burlaka.lesson3.task1;

public class Main {

    public static int countSymbol(String someString, char symbol) {
        int counter = 0;
        for (int i = 0; i < someString.length(); i++) {
            if (someString.charAt(i) == symbol) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        String newLine = System.getProperty("line.separator");
        String s = "***     ***" + newLine +
                " ***   *** " + newLine +
                "  *** ***  " + newLine +
                "   *****   " + newLine +
                "    ***    " + newLine +
                "    ***    " + newLine +
                "    ***    ";
        System.out.println(s);
        char someChar1 = '*';
        int result1 = countSymbol(s, someChar1);
        System.out.println("Symbol '" + someChar1 + "' appears " + result1 + " times.");
        char someChar2 = ' ';
        int result2 = countSymbol(s, someChar2);
        System.out.println("Symbol '" + someChar2 + "' appears " + result2 + " times.");
    }
}