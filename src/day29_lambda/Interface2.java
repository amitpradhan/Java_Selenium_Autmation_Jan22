package day29_lambda;

@FunctionalInterface
public interface Interface2 {
    public int math_operation(int a, int b , int c);
}

class Lambda2{
    public static void main(String[] args) {
        //add
        Interface2 add = (x, y, z) ->  x + y + z;
        System.out.println(add.math_operation(10,20,30));

        Interface2 multiply = (x, y,z) -> x * y * z;
        System.out.println(multiply.math_operation(4,5,6));

        Interface2 multiplyAnPrint = (x, y,z) -> {
            System.out.println("Multiplying ->" +x +"," + y+"," + z);
            return x * y * z;
        };
        System.out.println( multiplyAnPrint.math_operation(3,2,4));


    }
}

