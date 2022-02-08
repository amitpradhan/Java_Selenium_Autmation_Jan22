package day9.superthis;

import day9.private_constructor.C;

public class C_child extends C{
    public C_child(){
        super(10);
    }

    public static void main(String[] args) {
        C c = new C(100);

//          c = new C(10, 10);
    }
}
