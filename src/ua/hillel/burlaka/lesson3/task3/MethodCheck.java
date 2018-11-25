package ua.hillel.burlaka.lesson3.task3;

public class MethodCheck {
    public static boolean checkExpression (String s) {
        String expr = s.replaceAll("\\s+","");
        int length = s.length();
        if (length < 2) return true;
        String exprReversed = new StringBuffer(expr).reverse().toString();
        return exprReversed.equalsIgnoreCase(expr);
    }
}
