package gettingComfortable;

import java.util.Scanner;


public class FirstProgram {
    public static void main(String[] args) {
//      output
        System.out.println("All the best Anu");

//      input
        Scanner sc = new Scanner(System.in);
//        System.out.println(sc.next());

        //primitives
        int one = 1;
        float a = 2.4f;
        long l = 243298777709090L;
        double d = 239028312.872187;
        boolean b = true;
        char c = 'a';

        //Wrapper class
        Integer i = 2;

//       implicit type conversions
        int num1 = 2;
        float num2 = 3.4f;
        System.out.println(num1+num2);

        int number  = 'A' - 0;

//        explicit type conversion

        System.out.println((int)'a');
    }
}
