package day19_collection_starts;

import java.util.ArrayList;
import java.util.List;

public class ObjectList {
    public static void main(String[] args) {
        List<Object> objectList = new ArrayList<>();
            objectList.add(100);
            objectList.add("HI");
            objectList.add(2.3d);
            objectList.add(true);

        int i =objectList.size()-1;

        System.out.println("Print in reverse..");
        while (i>=0){
            System.out.println(objectList.get(i));
            i--;
        }

        System.out.println("Print in normal direction..");

        i = 0;
        while (i<= objectList.size()-1){
            System.out.println(objectList.get(i));
            i++;
        }

    }
}
