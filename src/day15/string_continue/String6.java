package day15.string_continue;

public class String6 {
    public static void main(String[] args) {
        /**
         * String objects are immutable because if it would have impacted other reference variables which
         * would be chaotic.
         */
        String city1 = "Pune";
        String city2 = "Pune";
        String city3 = "Pune";
        String city4 = "Pune";

        System.out.println(city1);
        System.out.println(city2);

        System.out.println(city1.concat(" is my city!"));

        System.out.println(city1);
        System.out.println(city2);
    }
}
