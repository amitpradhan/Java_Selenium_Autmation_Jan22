package day29_lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorEx {
    public static void main(String[] args) {

        List<Courses> coursesList = new ArrayList<>();

        coursesList.add(new Courses(1, "Java", "3 Months"));
        coursesList.add(new Courses(2, "Selenium", "1 Month"));
        coursesList.add(new Courses(3, "Python", "2 Months"));
        coursesList.add(new Courses(4, "Java 8", "0.5 Months"));

        //Sorting using comparator
        Collections.sort(coursesList, (c1,c2) ->{
            return c1.courseName.compareToIgnoreCase(c2.courseName);
        });
        for(Courses c: coursesList){
            System.out.println(c.courseId+ " "+c.courseName+" "+c.duration);
        }

     }
}

class Courses{
    int courseId;
    String courseName;
    String duration;
    public Courses(int courseId, String courseName, String duration){
        this.courseId = courseId;
        this.courseName = courseName;
        this.duration = duration;
    }

}
