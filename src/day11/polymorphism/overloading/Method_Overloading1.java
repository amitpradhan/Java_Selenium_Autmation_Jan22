package day11.polymorphism.overloading;

public class Method_Overloading1 {
    /**
     * poly - many
     * morph - form
     *
     * Java implements polymorphism using method overloading and method overriding
     *
     * 1- Method overloading is a concept where
     *     can have multiple methods with same name but with different arguments.
     * 2- Arguments can be different in below 3 ways
     *    i) No of arguments
     *    ii) Type of arguments
     *    iii) Sequence of arguments
     *
     */
//    private int m(){
//        return 0;
//    }
    public void m(){
        System.out.println("In no arg m()..");
    }
    public void m(int i){
        System.out.println("In one INT arg m()..");
    }
    public void m(int i , int j){
        System.out.println("In two INT arg m()..");
    }
    public void m(String s){
        System.out.println("In one STRING arg m()..");
    }
    public void m(int i , String s){
        System.out.println("In two INT-STRING arg m()..");
    }
    public void m(String s, int i){
        System.out.println("In two INT-STRING arg m()..");
    }

    //we can overload the main method as well
    public static void main(String args){
        System.out.println("Our overloaded main method..->"+args);
    }
//    public static void main(String args){
//        System.out.println("Our overloaded main method..->"+args);
//    }



    public static void main(String[] args) {
        Method_Overloading1 method_overloading1_obj = new Method_Overloading1();
        method_overloading1_obj.m();
        method_overloading1_obj.m(10);
        method_overloading1_obj.m("Java", 100);

        main("Testing main overloading..");


    }
}

