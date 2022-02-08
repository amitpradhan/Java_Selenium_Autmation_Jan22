package day7;

public class SOP_Meaning {
    public static void main(String[] args) {
        System.err.println("Hi..i am learning Java. Java is very easy.");

        System1.out.printString("Hi..i am learning Java. Java is very easy.");

        PrintStream1.printString("Hi..i am learning Java. Java is very easy.");
    }

}



class PrintStream1{
    public static void printString(String str){
        System.out.println(str);
    }
}

class System1{
    public static PrintStream1 out  ;
}
