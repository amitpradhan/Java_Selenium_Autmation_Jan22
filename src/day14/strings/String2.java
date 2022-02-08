package day14.strings;

public class String2 {
    public static void main(String[] args) {
        String str = "Hi , How are you ? I am fine! Learning Java! end of string.";

        String[] strArray = str.split("!");
        System.out.println("Size-> "+strArray.length);

        for (int i=0;i< strArray.length;i++)
            System.out.println(strArray[i]);
    }
}
