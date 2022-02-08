package day15.string_continue;


public class String5 {
    public static void main(String[] args) {

        int i =10;
        int j = 20;
        i = i+j;

        String str1 = "Hello!";
        String str2 = "Hello!";

        System.out.println(str1.equals(str2));
        System.out.println(str1==str2);
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());


        System.out.println("*************************");
        String str3 = new String("Java!");
        String str4 = new String("Java!");
        System.out.println(str3.equals(str4));
        System.out.println(str3 == str4);
        System.out.println(str3.hashCode());
        System.out.println(str4.hashCode());
    }
}
