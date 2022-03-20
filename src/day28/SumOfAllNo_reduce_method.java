package day28;

import java.util.List;
import java.util.Map;

public class SumOfAllNo_reduce_method {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(2,1,11,13,32,1,3,56,5,5,100,10);

        System.out.println(sumOfAllNo_structure_way(integerList));
        System.out.println(sumOfAllNo_using_functional_my_sum(integerList));
        System.out.println(sumOfAllNo_using_lambda(integerList));
    }

    //Structure way
    public static int sumOfAllNo_structure_way(List<Integer> integerList){
        int sum  =0;
        for (int i :integerList) {
           // sum = sum +i;
            sum += i;
        }
        return sum;
    }

    private static Integer my_sum(Integer aggregate, Integer nextNumber){
        return aggregate += nextNumber;
    }
    public static int sumOfAllNo_using_functional_my_sum(List<Integer> integerList){
      return  integerList.stream()
                .reduce(0, SumOfAllNo_reduce_method::my_sum);
    }

    public static int sumOfAllNo_using_lambda(List<Integer> integerList){
        return integerList.stream()
                .reduce(0, (x,y)-> x +y);
    }

}
