package day22;

import java.util.HashMap;
import java.util.Map;

public class MapOfMap {

    public static void main(String[] args) {
        Map<String, String> qa = new HashMap<>();
            qa.put("Library", "Selenium");
            qa.put("Language", "Java");
            qa.put("Report", "Extent report");

        Map<String, String> dev = new HashMap<>();
            dev.put("Library", "Spring boot");
            dev.put("Language", "Java 11");
            dev.put("Test", "JUnit");

        Map<String, Map<String, String>> techies = new HashMap<>();
        techies.put("techie1", qa);
        techies.put("techie2", dev);

        System.out.println(techies);
        System.out.println(techies.get("techie1"));
        System.out.println(techies.get("techie2"));
        System.out.println(techies.get("techie2").get("Language"));
        System.out.println(techies.get("techie1").get("Report"));


    }
}
