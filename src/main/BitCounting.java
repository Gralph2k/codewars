package main;

import java.util.ArrayList;
import java.util.List;

/*
Write a function that takes an integer as input, and returns the number of bits that are equal to one in the binary representation of that number.
You can guarantee that input is non-negative.

Example: The binary representation of 1234 is 10011010010, so the function should return 5 in this case
 */
public class BitCounting {
    public static int countBits(int n){
       return (int) intToBinary(n).stream()
               .filter(o->o==1)
               .count();
    }

    public static List<Integer> intToBinary(int n) {
        List<Integer> result = new ArrayList<>();
        while (n>0) {
            result.add(0, n%2);
            n=(n-n%2)/2;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(intToBinary(1234));
        System.out.println(countBits(1234));
        System.out.println(countBits2(1234));
    }

    public static int countBits2(int n){
        return Integer.toBinaryString(n)
                .replaceAll("0", "")
                .length();
    }

}
