package day6;

public class MainMethodTest {

    //method overloading
    public static void main(){
        System.out.println("User's main method without args..");
    }

    public static void main(String[] args) {
        System.out.println("In main method..execution will start from here.");
        main();
    }
}
