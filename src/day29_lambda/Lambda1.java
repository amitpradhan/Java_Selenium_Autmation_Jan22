package day29_lambda;

public class Lambda1 {
    /**
     * 1- Lambda is an anonymous method that do not have any name and belong any class.
     * 2- Lambda expression is a block of code that may or may not accept arguments and returns a value.
     * 3- Lambda expression provides implementation for Functional Interfaces which reduced all boilerplate code.
     * 4- Functional Interface has only single abstract method (SAM). And it can be annotated bt @FunctionalInterface
     * 5- Lambda Syntax -
     *    (argument-list) -> {Body}
     *
     *    public void m(int a, int b){
     *        return a + b;
     *    }
     *    (a,b) -> a + b;
     *    () -> {} //No parameter lambda
     *    (name) -> {} //one param lambda
     *
     *
     *    Steps to create lambda
     *    1- Create functional interface
     *    2- create lambda and hold using on Interface type valriable
     *    3- Call the method using variable
     */

    public static void main(String[] args) {
        Interface1 interface1 = (name) -> {
            return "Hello " +name;
        };
        System.out.println(interface1.getName("Amit!"));
        System.out.println(interface1.getName("Nibedita!"));
    }
}
