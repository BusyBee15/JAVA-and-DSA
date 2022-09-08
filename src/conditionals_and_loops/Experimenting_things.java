package conditionals_and_loops;

import java.util.Arrays;

public class Experimenting_things {
    int a = 10;
    public static void main(String[] args) {
        String s = "123";
        char[] arr = s.toCharArray();

        Experimenting_things obj = new Experimenting_things();

        System.out.println(Arrays.toString(arr));

        System.out.println(String.valueOf(obj));
        System.out.println(String.valueOf(arr, 1,2));

        String s2 = String.valueOf(arr);

        System.out.println(Integer.valueOf(s2)); //converts s2 to Integer object
        System.out.println(Integer.parseInt(s2)); //converts s2 to int

    }
}
