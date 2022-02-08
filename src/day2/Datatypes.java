package day2;

import day1.Hello_Java;

public class Datatypes {

    public static void main(String[] args) {

        //8 primitive datatypes in Java

        //numeric datatypes , default is 0
        //each primitive datatype has one wrapper class defined
        byte b = 8;
        short s = 16;
        int i =32;
        i = 20;
        long l = 68978794;

        //decimals , default value is 0.0
        float f = 32.2f;
        double d = 64.2d;
        System.out.println(d + f);

        boolean bool = false ; //default is false
        System.out.println(bool);

        char c = 'a';
        System.out.println(c);


        //String is a final class in Java. It is NOT a primitive datatype.
        String str = "hi..hw r u?";

        //Every class can be used as a datatype.
        //User defined class can also be used as datatypes
        Datatypes datatypes = null;
        datatypes = new Datatypes();
        Hello_Java helloJava = new Hello_Java();

    }
}
