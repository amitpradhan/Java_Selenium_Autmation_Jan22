package day19_collection_starts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List4 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("ABCD");
        stringList.add("XYZ");
        stringList.add("CDE");
        stringList.add("STR");

        Iterator<String> itr = stringList.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());


    }
}
