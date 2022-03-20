package day28;

import java.util.Comparator;
import java.util.List;

public class PrintStringSortedWithSpecificLength {
    public static void main(String[] args) {
        List<String> courseList= List.of("Java", "Python", "Spring boot", "Spring", "AWS", "Selenium", "Docker", "Selenium Webdriver"
                , "Selenium Grid", "TestNG", "Junit");
        printSortedCourseWithCourseLength(courseList);
    }

    private static void printSortedCourseWithCourseLength(List<String> courseList) {
        courseList.stream()
                .sorted(Comparator.comparing(course-> course.length()))
                .forEach(System.out::println);
    }
}
