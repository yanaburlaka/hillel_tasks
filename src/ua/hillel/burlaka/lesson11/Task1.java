package ua.hillel.burlaka.lesson11;

import javafx.beans.binding.ObjectExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Task1 {

    public static void main(String[] args) {

        List<Object> list = Arrays.asList(1, 2, Arrays.asList(3, Arrays.asList(4, 5)), 6);
        List<Object> result = flatten(list);
        System.out.println(result);

    }

    /*private static List<Object> flatten2(List<Object> list) {
        return flatten_(list, new ArrayList<>());
    }

    private static List<Object> flatten_(List<Object> list, List<Object> accum) {
        for (Object o : list) {
            if (o instanceof List) {
                accum.addAll(flatten_((List<Object>)o, accum));
            }
            else {
                accum.add(o);
            }
        }
    }*/

    private static List<Object> flatten(List<Object> list) {
        ArrayList<Object> objects = new ArrayList<>();
        for (Object o : list) {
            if (o instanceof List) {
                List flatten = flatten((List<Object>) o);
                objects.addAll(flatten);
            }
            else {
                objects.add(o);
            }
        }
        return objects;
    }
}
