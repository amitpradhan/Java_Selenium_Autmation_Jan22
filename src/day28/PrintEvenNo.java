package day28;

import java.util.List;

public class PrintEvenNo {

    public static void main(String[] args) {
        List<Integer> testIntegerList = List.of(21, 223, 44, 55, 6, 10, 2222, 200, 201, 100, 2011);

        printEvenNumberFromList_StructureWay(testIntegerList);
        System.out.println("********************");
        printAllEvenNoInList_functionalWay_without_lambda(testIntegerList);
        System.out.println("********************");
        printAllEvenNoInList_functionalWay_with_lambda(testIntegerList);
    }
    public static void  printAllEvenNoInList_functionalWay_with_lambda(List<Integer> integerList){
        integerList.stream()
                .filter(number -> number % 2 ==0)
                .forEach(System.out::println);
    }
    public static void printAllEvenNoInList_functionalWay_without_lambda(List<Integer> integerList){
        integerList.stream()
                .filter(PrintEvenNo::isEven)
                .forEach(System.out::println);

    }
    private static boolean isEven(int i){
        return i % 2 == 0;
    }
    public static void printEvenNumberFromList_StructureWay(List<Integer> integerList) {
        for (int i : integerList) {
            if (i % 2 == 0)
                System.out.println(i);
        }
    }

}

