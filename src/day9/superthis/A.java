package day9.superthis;

public class A {
    int i = 10;

    public void m(){
        System.out.println("Inside A-m()..");
    }

    public A(){
        System.out.println("In A's default constructor");
    }
    public A(int a , int b){
        System.out.println("In A's two arg INT-INT constructor");
    }


}
