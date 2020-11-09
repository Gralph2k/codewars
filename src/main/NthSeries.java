package main;

import java.text.DecimalFormat;

/*
Task:
Your task is to write a function which returns the sum of following series upto nth term(parameter).

Series: 1 + 1/4 + 1/7 + 1/10 + 1/13 + 1/16 +...
Rules:
You need to round the answer to 2 decimal places and return it as String.

If the given value is 0 then it should return 0.00

You will only be given Natural Numbers as arguments.

Examples:
SeriesSum(1) => 1 = "1.00"
SeriesSum(2) => 1 + 1/4 = "1.25"
SeriesSum(5) => 1 + 1/4 + 1/7 + 1/10 + 1/13 = "1.57"
 */
public class NthSeries {
    private static DecimalFormat df = new DecimalFormat("0.00");

    public static String seriesSum(int n) {
        double result = n;
        double div = 4;
        if (n>1) {
            result=1;
            for (int i=1; i<n;i++) {
                //System.out.println(result+ " 1/"+div+" = "+ (result+1/div));
                result+=1/div;
                div+=3;
            }
        }
        return df.format(result);
    }

    public static void main(String[] args) {
        System.out.println(seriesSum(0));
        System.out.println(seriesSum(1));
        System.out.println(seriesSum(2));
        System.out.println(seriesSum(5));
    }
}
