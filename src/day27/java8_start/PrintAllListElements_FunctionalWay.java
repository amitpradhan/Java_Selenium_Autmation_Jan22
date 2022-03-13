package day27.java8_start;

import java.util.List;

public class PrintAllListElements_FunctionalWay {

    public static void main(String[] args) {
        List<Object> list = List.of(12,23,2,31,1,1,12,31,1321);
        printAllElementsInList(list);
    }

    public static void printAllElementsInList(List<Object> list){
        //System.out.println() is executed directly
        list.stream()
                .forEach(System.out::println);

        //System.out.println() is executed through our print method
        list.stream()
                .forEach(PrintAllListElements_FunctionalWay::print);

    }

    private static void print(Object o){
        System.out.println(o);
    }
}
