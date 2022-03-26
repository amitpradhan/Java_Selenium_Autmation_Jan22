package day29_lambda;

@FunctionalInterface //optional
public interface MyInterface {
    public void printCourseName(String courseName);
}

class MyClass{
    public static void main(String[] args) {
        //boilerplate code -
        //without lambda
        MyInterface myInterface = new MyInterface() {
           @Override
            public void printCourseName(String courseName){
               System.out.println(courseName);
            }
        }  ;
        myInterface.printCourseName("Selenium");


    }
}
