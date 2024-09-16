package org.vikram;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringPractice {
    public static void main(String[] args) {
       // reverseStringInSameOrder();
        //charCountStringUsingCharArray();
        //charCountString();
        reverseString();
        reverseAaString();



    }

    public static void reverseStringInSameOrder() {
        String input = "This is a car";
        List<String> list = new ArrayList<>(Arrays.asList(input.split(" ")));
        String output = list.stream().map(m -> new StringBuilder(m).reverse()).collect(Collectors.joining(" "));
        System.out.println("====> " + output);
        String output2 = Stream.of(input.split(" ")).map(m -> new StringBuilder(m).reverse()).collect(Collectors.joining(" "));
        System.out.println("<=====> " + output2);

    }

    public static void charCountStringUsingCharArray() {
        String input = "character";
        char[] ch = input.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for(int i =0; i<ch.length; i++) {
            if(map.containsKey(ch[i])) {
                map.put(ch[i], map.get(ch[i]) + 1);
            } else {
                map.put(ch[i], 1);
            }
        }
        map.entrySet().stream().forEach(m -> System.out.println("string char counts : " +m.getKey() + " " + m.getValue()));

    }

    public static void charCountString() {
        String input = "character";
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<input.length(); i++) {
            if(map.containsKey(input.charAt(i))) {
                map.put(input.charAt(i), map.get(input.charAt(i)) +1 );
            } else {
                map.put(input.charAt(i), 1);
            }
        }
        map.entrySet().stream().forEach(m -> System.out.println("map values : "  + m.getKey() +" " +  m.getValue()));
    }

    public static Map<Character, Integer> countChar(String input) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<input.length(); i++) {
            if(map.containsKey(input.charAt(i))) {
                map.put(input.charAt(i), map.get(input.charAt(i)) +1 );
            } else {
                map.put(input.charAt(i), 1);
            }
        }
       return map;
    }

    public static void reverseString() {
        String input = "reverse a string";
        String inputArr[] = input.split(" ");
        StringBuilder output = new StringBuilder();
        for (String word : inputArr) {
            Map<Character, Integer> map = countChar(word);
            if (map.getOrDefault('r', 0) == 2) {
                output.append(new StringBuilder(word).reverse().toString());
            } else {
                output.append(word);
            }
            output.append(" ");
        }
        System.out.println("reverse : " + output);
    }

    public static void reverseAString() {
        String input = "reverse a string";
        String inputArr[] = input.split(" ");
        StringBuilder output = new StringBuilder();
        for (String word : inputArr) {
            Map<Character, Integer> map = countChar(word);
            int countOfR = map.containsKey('r') ? map.get('r') : 0; // Get the count of 'r' by  ternary operator to check whether the map contains the key 'r' and then assigns a value to countOfR accordingly.

            if (countOfR == 2) {
                output.append(new StringBuilder(word).reverse());
            } else {
                output.append(word);
            }
            output.append(" "); // Add space between words
        }
        System.out.println("reverse : " + output);
    }

    public static void reverseAaString() {
        String input = "reverse a string";
        String inputArr[] = input.split(" ");
        StringBuilder output = new StringBuilder();
        for (String word : inputArr) {
            Map<Character, Integer> map = countChar(word);
            int countOfR =0;
            if(map.containsKey('r')) {
                countOfR = map.get('r');
            }
            if (countOfR == 2) {
                output.append(new StringBuilder(word).reverse());
            } else {
                output.append(word);
            }
            output.append(" ");
        }
        System.out.println("reverse : " + output);
    }
}
