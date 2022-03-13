package day27.java8_start;

import java.util.List;

public class PrintAllListElements_StructuredWay {

    public static void main(String[] args) {
        List<Object> list = List.of(12,23,2,31,1,1,12,31,1321);
        printAllElementsInList(list);
    }

    public static void printAllElementsInList(List<Object> list){
        for (Object o:list) {
            System.out.println(o);
        }
    }
}
