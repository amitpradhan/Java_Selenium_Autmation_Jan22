package day20;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetVsList {
    /**
     * 1 - Set is unordered ,whereas list is ordered.
     * 2- Set doesn't recognize duplicates but List allows duplicates
     *
     */
    public static void main(String[] args) {
        Set<Object> objectSet = new HashSet<>();
            objectSet.add(1111);
            objectSet.add("Java");
            objectSet.add(11.11d);
            objectSet.add(1111);
            objectSet.add("Java");

        System.out.println("No of elements in the set ->"+objectSet.size());
        for (Object o:objectSet) {
            System.out.println(o);
        }

        System.out.println();
        List<Object> objectList = new ArrayList<>();
            objectList.add(2222);
            objectList.add("Selenium");
            objectList.add(22.22d);
            objectList.add("Selenium");
            objectList.add(2222);
        System.out.println("No of element in the List ->"+objectList.size());
        for (Object o :objectList) {
            System.out.println(o);
        }



    }

}
