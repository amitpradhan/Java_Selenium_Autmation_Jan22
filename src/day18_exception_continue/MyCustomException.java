package day18_exception_continue;

public class MyCustomException extends Exception{

    public static void main(String[] args) throws MyCustomException {
//        System.out.println(new MyCustomException());

    }

    MyCustomException customException() throws MyCustomException {
        throw new MyCustomException();
    }


}

