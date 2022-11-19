package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Task 1
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

        // Task 2
        List<Integer> nums2 = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Set<Integer> set = new TreeSet<>(nums2);
        for (Integer num : set) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

        // Task 3
        List<String> listOfWords = new ArrayList<>(List.of("abc", "def", "wss", "abc"));
//        Set<String> set2 = new HashSet<>(listOfWords);
//        System.out.println(set2);
        Map<String, Integer> map = new HashMap<>();
        for (String word : listOfWords) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.print(entry.getKey() + " ");
            }
        }
        System.out.println();


        // Task 4
        List<String> listOfWords2 = new ArrayList<>(List.of("abc", "def", "wss", "abc", "ffs"));
        Map<String, Integer> map2 = new HashMap<>();
        for (String word : listOfWords2) {
            if (map2.containsKey(word)) {
                map2.put(word, map2.get(word) + 1);
            } else {
                map2.put(word, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.print(entry.getKey() + " - " + entry.getValue());
            }
        }

    }
}