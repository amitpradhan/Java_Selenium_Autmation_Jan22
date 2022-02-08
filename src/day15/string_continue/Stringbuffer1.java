package day15.string_continue;

public class Stringbuffer1 {

    /**
     * StringBuffer class is thread safe (synchronized) where as StringBuilder class is not thread safe.
     * @param args
     */
    public static void main(String[] args) {
        StringBuffer stringBuffer1 = new StringBuffer("Java string objects!");
        System.out.println(stringBuffer1);
        stringBuffer1.append("String buffer objects are not immutable!");
        System.out.println(stringBuffer1);

      //  StringBuffer stringBuffer2 = "Hi";

    }
}
