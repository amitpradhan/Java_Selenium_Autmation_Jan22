package day20;

import java.util.*;

public class AddAll_Demo {
    public static void main(String[] args) {
        List<String> course= new ArrayList<>();
        course.add("Java");
        course.add("Python");
        course.add("Selenium");
        course.add("C#");

        List<String> cities = new LinkedList<>();
        cities.add("Pune");
        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("London");

        Set<String> fruits= new HashSet<>();
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Kiwis");

        Set<Object> objectSet = new HashSet<>();
        objectSet.add(1234);
        objectSet.add("Red");
        objectSet.add(122.22d);
        objectSet.add(true);

        System.out.println(course);
        course.addAll(cities);
        System.out.println(course);
        course.addAll(fruits);
        System.out.println(course);
//        course.addAll(objectSet);

        System.out.println(course.contains("Kiwis"));
        System.out.println(course.containsAll(fruits));
        course.remove("Kiwis");
        System.out.println(course.contains("Kiwis"));
        System.out.println(course);
        System.out.println(fruits);
        }

}
