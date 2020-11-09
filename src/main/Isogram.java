package main;

import java.util.Arrays;
import java.util.function.Function;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

/*
An isogram is a word that has no repeating letters, consecutive or non-consecutive. Implement a function that determines whether a string that contains only letters is an isogram. Assume the empty string is an isogram. Ignore letter case.

isIsogram "Dermatoglyphics" == true
isIsogram "aba" == false
isIsogram "moOse" == false -- ignore letter case
 */
public class Isogram {
    public static boolean isIsogram(String str) {
        long duplicates = Arrays.stream(str.split(""))
            .map(s -> s.toLowerCase())
            .collect(groupingBy(Function.identity(), counting()))
            .entrySet().stream()
            .filter(e -> e.getValue() > 1)
            .count();
        return duplicates == 0;
    }

    public static void main(String[] args) {
        System.out.println(isIsogram("Dermatoglyphics"));
        System.out.println(isIsogram("aba"));
        System.out.println(isIsogram("moOse"));
    }
}
