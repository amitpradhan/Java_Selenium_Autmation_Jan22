package day20;

import java.util.ArrayList;
import java.util.List;

public class ListOfList {
    public static void main(String[] args) {
        List<String> course= new ArrayList<>();
            course.add("Java");
            course.add("Python");
            course.add("Selenium");
            course.add("C#");



        List<String> fruits= new ArrayList<>();
            fruits.add("Orange");
            fruits.add("Apple");
            fruits.add("Banana");
            fruits.add("Kiwis");

        List< List<String>> mainList = new ArrayList<>();
            mainList.add(course);
            mainList.add(fruits);


        for (List<String> stringList:mainList) {
            for (String element:stringList) {
                System.out.print(element+" ");
            }
            System.out.println();


        }

    }
}
