package day4;

public class AnonymousArray {

    public static void main(String[] args) {
        //we passed an anonymous array as argument
        System.out.println(sumOfInteger(new int[] {10,11,12,13,14}));

        //String anonymous array

       stringArrayTest(new String[]{"Selenium", "Java", "Python"} );
    }


    public static void stringArrayTest(String[] stringArray){

        for (int i =0; i<stringArray.length; i++)
            System.out.println(stringArray[i]);
    }


    public static int sumOfInteger(int[] intArr){
        //local variable
        int sum = 0;

        for( int i = 0; i<intArr.length;i++)
            sum = sum + intArr[i];

        return sum;

    }
}
