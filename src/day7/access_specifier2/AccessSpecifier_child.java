package day7.access_specifier2;

import day7.access_specifiers.AccessSpecifier;

public class AccessSpecifier_child extends AccessSpecifier {

    public static void main(String[] args) {
        AccessSpecifier obj = new AccessSpecifier();
        System.out.println("Public variable i1->"+obj.i1);
        System.out.println("Protected variable i2->"+i2);
//        System.out.println("Default variable i3->"+obj.i3);
//        System.out.println("Private variable i4->"+obj.i4);

        obj.m1();
        m2();
//        obj.m3();
//        obj.m4();
    }
}
