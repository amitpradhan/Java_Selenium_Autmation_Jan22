package day28;

import java.util.List;

public class PrintCourse_with_courseLength_using_map {

    public static void main(String[] args) {
        List<String> courseList= List.of("Java", "Python", "Spring boot", "Spring", "AWS", "Selenium", "Docker", "Selenium Webdriver"
                , "Selenium Grid", "TestNG", "Junit");
        printCourseLengthOfEachCourse(courseList);
        System.out.println("***************************");
        printEvenCourseLengthOfCourseList(courseList);
    }

    public static void printCourseLengthOfEachCourse(List<String> stringList){
        stringList.stream()
                .map(course -> course +"-->"+course.length())
                .forEach(System.out::println);
    }
    public static void printEvenCourseLengthOfCourseList(List<String> stringList){
        stringList.stream()
                .filter(course -> course.length() %2 ==0)
                .map(course -> course +"-->"+course.length())
                .forEach(System.out::println);
    }

}
