package conditionals_and_loops.basic_java_programs;

import java.util.Scanner;

//Question
// https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/

//operator precedence
public class _03_Subtract_Product_and_SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        System.out.println(product(n)-sum(n));
    }
    private static int sum(int n){
        int res=0;
        while(n>0) {
            res = res + n%10;
            n/=10;
        }
        return res;
    }
    private static int product(int n){
        int res=1;
        while(n>0) {
            res = res * (n%10);
            n/=10;

        }

        return res;
    }
}
