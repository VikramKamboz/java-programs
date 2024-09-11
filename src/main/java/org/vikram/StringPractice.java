package org.vikram;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringPractice {
    public static void main(String[] args) {
        reverseStringInSameOrder();
        charCountStringUsingCharArray();
        charCountString();


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
}
