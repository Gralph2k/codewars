package main;


import java.util.Comparator;
import java.util.stream.Collectors;

/*
Your task is to make a function that can take any non-negative integer as an argument and return it with its digits in descending order. Essentially, rearrange the digits to create the highest possible number.

Examples:
Input: 42145 Output: 54421

Input: 145263 Output: 654321

Input: 123456789 Output: 987654321
 */
public class DescendingOrder {

    public static int sortDesc(final int num) {
        return Integer.parseInt(
        String.valueOf(num)
                .chars()
                .mapToObj(x -> Character.getNumericValue(x))
                .sorted(Comparator.reverseOrder())
                .map( n -> n.toString() )
                .collect(Collectors.joining( "" )));
    }

    public static void main(String[] args) {
        System.out.println(sortDesc(42145));
        System.out.println(sortDesc(145263));
        System.out.println(sortDesc(123456789));
    }
}
