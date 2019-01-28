package ua.hillel.burlaka.lesson11;

import java.util.*;

public class Task5 {

    public static void main(String[] args) {

        List<Object> list = Arrays.asList(8, 3, 4, 5, 1);
        Integer number = 13;
        checkMapMethod(list, number);
    }

    private static void checkMapMethod(List<Object> list, Integer number) {
        Map<Integer, Integer> checkMap = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            if (checkMap.containsKey(list.get(i))) {
                System.out.println("first - " + checkMap.get(list.get(i)));
                System.out.println("second - " + i);
            } else {
                checkMap.put(number - (Integer) list.get(i), i);
            }
        }
    }
}