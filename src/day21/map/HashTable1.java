 package day21.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTable1 {
    public static void main(String[] args) {
        //null is accepcted as a key and value in HashMap but not allowed in case of HashTable
        Map<String,String> hashmap = new HashMap<>();
        hashmap.put("City","Pune");
        hashmap.put(null,null);
        System.out.println(hashmap.size()); //2
        System.out.println(hashmap.get(null));

        Map<String ,String> hashTable= new Hashtable<>();
        hashTable.put("Country", "India");
        hashTable.put("null", "null");
        System.out.println(hashTable.size());

    }
}
