package day29_lambda;

public class MyLambda {
    public static void main(String[] args) {
        String course = "Java8";

        //with datatype
        MyInterface myLambdaExp1 =
                (String course2) -> {
            System.out.println(course2);
        };
        myLambdaExp1.printCourseName(course);



    //without datatype
        MyInterface myLambdaExp2 = (course2) -> {
        System.out.println(course2);
    };
        myLambdaExp2.printCourseName(course);


    }


}

