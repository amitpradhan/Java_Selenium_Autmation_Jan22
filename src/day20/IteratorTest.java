package day20;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorTest {
    public static void main(String[] args) {
        Set<Object> idList = new HashSet<>();
            idList.add("ABCD1234");
            idList.add("DEF444");
            idList.add("XYZ1231");

       Iterator<Object> itr = idList.iterator();
        Object id1 =itr.next();
        System.out.println(id1);
        Object id2 = itr.next();
        System.out.println(id2);
        Object id3 = itr.next();
        System.out.println(id3);

    }
}
