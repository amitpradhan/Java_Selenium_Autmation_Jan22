package day9.superthis;

public class Parent {
    public Parent(){
        this(10);
        System.out.println("In Parent's default constructor");
    }

    public Parent(int i){
        this(10, "hi");
        System.out.println("In Parent's one  INT arg  constructor");
    }

    public Parent(int i, String s){
        System.out.println("In Parent's two  INT-STRING arg  constructor");
    }

    public Parent(double d){
        System.out.println("In parent's one arg double const");
        System.out.println("hi");
        System.out.println("hello");
    }

    public static void main(String[] args) {
        new Parent(10.2d);
    }

}
