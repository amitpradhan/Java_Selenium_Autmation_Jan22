package day9.superthis;

import test2.C;

public class Child extends Parent{
    /**
     * 1- At the first line , parents default const would be called by default .E.g. super() is invisbly present always
     * 2- If an argumented parent class const is called the, parents default cosnt would not be called anymore.
     * 3- At the first line of the const , either this or super can be present. Both cannot be present at the same time
     * 4- We cannot call using super and this anywhere else in the const. It must be at the begining of the const
     */
    public Child(){
        super();
        System.out.println("In Child's default constructor.");
    }
    public Child(int i){
        super();
//        this();
        System.out.println("In Child's one INT arg constructor.");
    }
    public Child(String s1, String s2){
        super(100);
        System.out.println("In Child's two string-string arg constructor.");
    }


    public Child(int a , int b , int c){
        this(10000);
        System.out.println("Child's 3 arg INT const..");
    }




    public static void main(String[] args) {
//        new Child();
//        new Child(10);
//        new Child("abcd", "xyz");
        new Child(10, 20 ,30);

    }
}
