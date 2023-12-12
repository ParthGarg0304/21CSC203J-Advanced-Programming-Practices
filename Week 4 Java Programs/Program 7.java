/*JAVA program to find numbers between 100 and 400 (both
included) where each digit of a number is an even number. The numbers
obtained should be printed in a comma-separated sequence.*/

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        for (int i = 100; i <= 400; i++) {
            String s = Integer.toString(i);
            if (Integer.parseInt(Character.toString(s.charAt(0))) % 2 == 0 &&
                    Integer.parseInt(Character.toString(s.charAt(1))) % 2 == 0 &&
                    Integer.parseInt(Character.toString(s.charAt(2))) % 2 == 0) {
                items.add(s);
            }
        }
        System.out.println(String.join(",", items));
    }
}
