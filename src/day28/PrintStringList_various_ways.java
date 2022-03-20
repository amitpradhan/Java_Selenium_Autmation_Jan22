package day28;

import java.util.List;

public class PrintStringList_various_ways {
    public static void main(String[] args) {
        List<String> courseList= List.of("Java", "Python", "Spring boot", "Spring", "AWS", "Selenium", "Docker", "Selenium Webdriver"
        , "Selenium Grid", "TestNG", "Junit");

        printAllCourses(courseList);
        System.out.println("********************");
        printAllCoursesWithSpecificWord(courseList, "Selenium");

        System.out.println("********************");
        printAllCoursesWithSpecificLength(courseList, 8);
    }

    //Print all courses
    public static void printAllCourses(List<String> stringList){
        stringList.stream()
                .forEach(System.out::println);
    }

    //Print all courses with specific word
    public static void printAllCoursesWithSpecificWord(List<String> stringList, String word){
        stringList.stream()
                .filter(course -> course.contains(word))
                .forEach(System.out::println);
    }

    //Print all courses with specific length
    public static void printAllCoursesWithSpecificLength(List<String> stringList, int courseLength){
        stringList.stream()
                .filter(course -> course.length() >= courseLength)
                .forEach(System.out::println);
    }





}
