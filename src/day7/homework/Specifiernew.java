package day7.homework;

import day7.homework1.Specifier1;

//import jdk.swing.interop.SwingInterOpUtils;

public class Specifiernew extends Specifier1 {


    public int p = 10;
    protected int q = 20;
    int r = 30;
    private int s = 40;

    public void arsenal() {
        System.out.println("This is a public method");

    }

    protected void chelse() {

        System.out.println("This is a prtected method");
    }

    void united() {
        System.out.println("This is a default method");

    }

    private void liverpool() {

        System.out.println("This is a private method");

    }


    public static void main(String[] args) {

        Specifiernew obj1=new Specifiernew();

        System.out.println("Access public variable from same class"+obj1.p);
        System.out.println("Access protected variable from same class"+obj1.q);
        System.out.println("Access default variabe from same class"+obj1.r);
        System.out.println("Access private variable from same class"+obj1.s);

        obj1.arsenal();
        obj1.chelse();
        obj1.liverpool();
        obj1.united();

        //Accessing in different class
        specifiernew1 obj2=new specifiernew1();

        //System.out.println("Access private variable from different class"+obj2.football);

        obj2.arsenal1();
       obj2.chelsea1();
       obj2.united1();
       //obj2.liverpool1();

       //Accessing in different package

        Specifier1 obj3=new Specifier1();

//        System.out.println("Access public variable in different class and different package"+ obj3.team);
        System.out.println("Access protected variable in different class and different package"+obj3.team1);


    }

}

class specifiernew1 {


    private int football = 99;


    public void arsenal1() {
        System.out.println("This is a public method");

    }

    protected void chelsea1() {

        System.out.println("This is a prtected method");
    }

    void united1() {
        System.out.println("This is a default method");

    }

    private void liverpool1() {
        System.out.println("This is a private method");
    }


}


