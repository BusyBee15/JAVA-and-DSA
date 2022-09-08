package conditionals_and_loops;

import java.util.Scanner;

public class _01_ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number to reverse");
        int num = input.nextInt();

        int res=0;
        while(num>0){
            res = res*10 + num%10;
            num=num/10;
        }
        System.out.println(res);

// one more approach
// get the number of digits , subtract 1 from it
// let's see it with eg, 123
// 3 must go in hundreds place, 2 must go in 10s place, 1 must go in units place
// 3*10^2 ( 2 is the number of digits - 1), in every iteration do the same, decrement number of digits
// we get the last digit using modulus operator
//        solution is messy compared to above one ,but still, this is one approach

//          int placeValue = getDigits(num)-1;
//
//          int res=0;
//          while(num>0){
//              res = res + (num%10)*(int)Math.pow(10, placeValue);
//              num = num/10;
//              placeValue--;
//          }
//        System.out.println(res);



    }

//    private static int getDigits(int n){
//        int d =0;
//        while(n>0){
//            d++;
//            n=n/10;
//        }
//        return d ;
//    }
}
