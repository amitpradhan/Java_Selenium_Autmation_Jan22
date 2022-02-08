package day8.inheritance.constructor_inheritance;

public class Parent {
    public Parent(){
        System.out.println("IN default no-arg parent's constructor");
    }

    public Parent(String str){
        System.out.println("IN default one-STRING-arg parent's constructor");
    }


    public Parent(int i, String name){
        System.out.println("IN parent's two-INT-STRING-arg  constructor");
    }

    public void m1(){
        System.out.println("Parent's m1()..");
    }
}
