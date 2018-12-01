package ua.hillel.burlaka.lesson1.task1;

public class Main {

    public static StringBuilder ShowString(String input) {
        String newLine = System.getProperty("line.separator");
        StringBuilder stringBuilder = new StringBuilder(input);
        stringBuilder.append("     ").append(input).append(newLine)
                .append(" ").append(input).append("   ").append(input).append(" ").append(newLine)
                .append("  ").append(input).append(" ").append(input).append("  ").append(newLine)
                .append("   ").append(input).append("**").append("   ").append(newLine);
        for (int i = 0; i < 3; i++) {
            stringBuilder.append("    ").append(input).append("    ").append(newLine);
        }
        return stringBuilder;
    }

    public static void main(String[] args) {
        String symbols = "***";
        String result = ShowString(symbols).toString();
        System.out.println(result);
    }
}