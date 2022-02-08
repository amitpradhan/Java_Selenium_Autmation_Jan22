package day15.string_continue;

public class String7 {
    public static void main(String[] args) {
        String str1 = " Hi , I am learning Java! Java is very easy! ";
        System.out.println(str1);
        System.out.println(str1.trim());

        String str2=str1.replace("Java", "Python");
        System.out.println(str2);
        str2 = str1.replaceAll(str1, "HELLO");
        System.out.println(str2);

    }
}
