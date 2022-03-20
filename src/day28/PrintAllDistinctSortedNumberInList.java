package day28;

import java.util.Comparator;
import java.util.List;

public class PrintAllDistinctSortedNumberInList {
    public static void main(String[] args) {
        List<Integer> list = List.of(12,23,2,31,1,1,12,31,10,10,2);
        printAllDistinctNumberFromList(list);
        System.out.println("**************");
        printAllDistinctAndSortedNumberFromList(list);
        System.out.println("**************");
        printAllDistinctAndSortedNumberReverseOrderFromList(list);
        System.out.println("**************");
        printAllDistinctAndSortedNumberNaturalOrderFromList(list);
    }

    public static void printAllDistinctNumberFromList(List<Integer> list){
        list.stream()
                .distinct()
                .forEach(System.out::println);
    }

    public static void printAllDistinctAndSortedNumberFromList(List<Integer> list){
        list.stream()
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }

    public static void printAllDistinctAndSortedNumberReverseOrderFromList(List<Integer> list){
        list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
    public static void printAllDistinctAndSortedNumberNaturalOrderFromList(List<Integer> list){
        list.stream()
                .distinct()
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);
    }


}
