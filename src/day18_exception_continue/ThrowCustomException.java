package day18_exception_continue;

import java.io.IOException;

public class ThrowCustomException {

    public static void main(String[] args)  {
        System.out.println("main starts");
        try {
            System.out.println("In myException-try block ");
            myException();
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println("In Exception catch block");
        }finally {
            System.out.println("In Exception-finally block");
        }
        try{
            System.out.println("In myNPE-try block");
            myNPE();
        }finally {
            System.out.println("In myNPE-Finally block");
        }
        System.out.println("main ends");
    }

    //RUN TIME Exception or Unchecked exception
    public static ArrayIndexOutOfBoundsException myArrayIndexOutOfBoundsException(){
        throw new ArrayIndexOutOfBoundsException();
    }
    public static NullPointerException myNPE(){
        throw new NullPointerException();
    }
    //COMPILE TIME Exception or Checked exception
    public static Exception myException() throws Exception {
        throw new Exception();
    }
    public static Throwable myThrowable() throws Throwable {
        throw new Throwable();
    }
    public static IOException myIOException() throws IOException {
        throw new IOException();
    }

}
