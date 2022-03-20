package day27.java8_start;

import java.util.List;

public class PrintOddNoList_Structured_Way {
    public static void main(String[] args) {
        List<Integer> list = List.of(12,23,2,31,1,1,12,31,1321);
        printAllOddNumber(list);
    }
    private static void printAllOddNumber(List<Integer> list){
        for (Integer i:list ) {
            if(i%2 !=0)
                System.out.println(i);
        }
    }
}
