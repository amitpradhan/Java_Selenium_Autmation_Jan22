package day29_lambda;

import java.util.LinkedList;
import java.util.List;

public class ForEachLambda_Ex {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("amit");
        list.add("Nibedita");
        list.add("Roseline");
        list.add("Nishant");

        list.forEach(
                (n) -> System.out.println(n)
        );
    }
}
