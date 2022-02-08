package day14.strings;

import java.util.Locale;

public class String3 {

    public static void main(String[] args) {
        String str = "Hi , How are you ? I am fine! Learning Java! end of string.";

        String str3 = new String("Hi...String"); //this will create a new memory location

        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.startsWith("h"));
        System.out.println(str.indexOf('a'));
        System.out.println( str.indexOf('a', 10));
        System.out.println(str.indexOf("you", 14));
        System.out.println(str.charAt(13));

        System.out.println(str.substring(10,20));
        System.out.println(str.contains("ABCD"));

        String str2 = "Hello...Java!";
        System.out.println(str.equals(str2));
        System.out.println(str2.equalsIgnoreCase("HELLO...Java!"));
        System.out.println(str.concat(str2));
        System.out.println(str);
        System.out.println(str2);
        //Strings are immutable
    }
}
