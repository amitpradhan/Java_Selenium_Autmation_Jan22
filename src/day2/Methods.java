package day2;

public class Methods {
    //functions or methods

    //1 - method name (should be logical and in camel case)
    //2- method arguments
    //3 - return type
    //4- access specifier
    //5- Block of code (body of method)

    //Defining the addNumber()
    public static long addNumber(int a ,int b){
        System.out.println("In add number method..");
        return a + b;
    }
    // create a method which accepts two integer and return its division

    // // create two methods which accepts two integer and return its multiplcation and substraction


    public static void main(String[] args) {
        System.out.println("Main method starts..");
        long result = addNumber(10, 30); //calling addNUmber ()
        System.out.println(result);
        System.out.println("Main ends..");
    }



}
