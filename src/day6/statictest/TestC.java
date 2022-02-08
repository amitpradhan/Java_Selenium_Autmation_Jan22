package day6.statictest;

import test2.C;

public class TestC {

    public static void main(String[] args) {
        C.m1();
        System.out.println(C.i);

        C c = new C();
        c.m2();
        System.out.println(c.city);
    }
}
