package day28;

import java.util.List;

public class SqaureOfEachNoAndSum {
    public static void main(String[] args) {
        List<Integer> list = List.of(12,23,2,31,1,1,12,31,10,10,2);
        System.out.println(sqaureOfEachNoAndSUm(list));
        System.out.println(sqaureOfEachNoAndSmm2(list));
    }

    public static int sqaureOfEachNoAndSUm( List<Integer> list ){
        return list.stream()
                .map(x -> x* x)
                .reduce(0, (x,y) -> x +y);
    }


    public static int sqaureOfEachNoAndSmm2( List<Integer> list ){
        return list.stream()
                .map(x -> x* x)
                .reduce(0, Integer::sum);
    }



}
