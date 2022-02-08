package day20;

import java.util.*;

public class ListSetCollection_Ex {
    public static void main(String[] args) {
        List<String> course= new ArrayList<>();
            course.add("Java");
            course.add("Python");
            course.add("Selenium");
            course.add("C#");

        Set<String> fruits= new HashSet<>();
            fruits.add("Orange");
            fruits.add("Apple");
            fruits.add("Banana");
            fruits.add("Kiwis");

        List<String> cities = new LinkedList<>();
            cities.add("Pune");
            cities.add("Mumbai");
            cities.add("Delhi");
            cities.add("London");

        Set<Object> objectSet = new HashSet<>();
            objectSet.add(1234);
            objectSet.add("Red");
            objectSet.add(122.22d);
            objectSet.add(true);

         List<Collection<Object>> collectionList = new ArrayList<>();
              collectionList.add(Collections.singleton(course));
              collectionList.add(Collections.singleton(fruits));
              collectionList.add(Collections.singleton(cities));
              collectionList.add(objectSet);

        for (Collection<Object> stringCollection:collectionList) {
            for (Object s:stringCollection) {
                System.out.print(s+" ");
            }
            System.out.println();
        }





    }
}
