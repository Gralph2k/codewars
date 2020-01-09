import java.util.ArrayList;
import java.util.stream.Stream;

//https://www.codewars.com/kata/541c8630095125aba6000c00/train/java
public class DRoot {

    public static int digital_root_v1(int n) {
        if (n < 10) {
            return n;
        } else {
            Integer sum = array_sum(int_to_array(n));
            return digital_root_v1(sum);
        }
    }

    public static int digital_root_v2(int n){
        if (n<10) {
            return n;
        } else {
            return Stream.of(String.valueOf(n).split(""))
                .map(Integer::parseInt)
                .reduce(0, (a,b) -> a+b);
        }
    }

    public static int digital_root(int n){
        return n<10 ? n: digital_root(n/10)+n%10;
    }


    public static void main(String[] args) {
        System.out.println(digital_root_v1(16));
        System.out.println(digital_root_v2(16));
        System.out.println(digital_root(16));

        System.out.println(digital_root_v1(132189));
        System.out.println(digital_root_v2(132189));
        System.out.println(digital_root(132189));

    }

    private static ArrayList<Integer> int_to_array(int n) {
        String str = Integer.toString(n);
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < str.length(); i++) {
            result.add(Integer.valueOf(str.substring(i, i + 1)));
        }
        return result;
    }

    private static Integer array_sum(ArrayList<Integer> arr) {
        Integer sum = 0;
        for (Integer i : arr) {
            sum += i;
        }
        return sum;
    }
}
