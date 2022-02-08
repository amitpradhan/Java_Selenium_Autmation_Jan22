package day7.access_specifiers;

public  class AccessSpecifier {

    static class InnerClass{

    }
    /**
     * 1- we have 4 access specifiers in Java but only 3 keywords i.e public, protected , private.
     * 2- If no access provider is given , it will become default (default is NOT a keyword)
     * 3- Access specifiers can be applied on methods , variables , classes , constructors , inner classes.
     * 4- public specified members will have highest access i.e. they will be accessible to the whole world i.e they will be accessible inside
     *     same class , outside class , outside package as well as outside project
     * 5- protected members will be accessible in same class , classes under same package and in the sub-classes
     *   under different packages.     *
     * 6- Default members will be accessible within same class and in classes under same package.
     * 7- private - will be accessible ONLY inside same class . private members have lowest accessibility
     *
     * 8- public > protected > default > private
     *
     *
     */

    public int i1 = 10;
    static protected int i2 = 20;
              int i3 = 30; //default variable
    private int i4 = 40;

    public void m1(){
        System.out.println("Inside public m1() ");
    }
    static protected void m2(){
        System.out.println("Inside protected m2() ");
    }
    void m3(){
        System.out.println("Inside default  m3() ");
    }
    private void m4(){
        System.out.println("Inside private  m4() ");
    }

    public static void main(String[] args) {
        AccessSpecifier obj = new AccessSpecifier();
        System.out.println("Public variable i1->"+obj.i1);
        System.out.println("Protected variable i2->"+obj.i2);
        System.out.println("Default variable i3->"+obj.i3);
        System.out.println("Private variable i4->"+obj.i4);

        obj.m1();
        obj.m2();
        obj.m3();
        obj.m4();
    }
}

class TestAccessSpecifier1{

static class A{

}
    public void m(){
        AccessSpecifier obj = new AccessSpecifier();
        System.out.println("Public variable i1->"+obj.i1);
        System.out.println("Protected variable i2->"+obj.i2);
        System.out.println("Default variable i3->"+obj.i3);
//        System.out.println("Private variable i4->"+obj.i4); //private variable cannot be accessed outside the AccessSpecifier1 class

        obj.m1();
        obj.m2();
        obj.m3();
//        obj.m4();//private methods cannot be accessed outside the AccessSpecifier1 class
    }
}


