package gettingComfortable;

//question
//Write a program to print whether a number is even or odd,
// also take input from the user.

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

//      A number is even, if the remainder is zero when it is divided by 2
        if(a%2==0){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }

//        Another solution : using binary bits
//        observe the binary representation of numbers from 0 to 9 (after that it is repeating)
//        0 : 0000
//        1 : 0001
//        2 : 0010
//        3 : 0011
//        4 : 0100
//        5 : 0101
//        6 : 0110
//        7 : 0111
//        8 : 1000
//        9 : 1001

//        observe, 1 and 0 is alternating in the first bit from right side
//        all the even numbers have 0 as the first bit, all the odd number have 1 as the first bit
//        so just check the first bit, no need to use modulo operator

//        Question boils down to - How to check a particular bit
//        answer : 'AND' the number with a number which has the particular 'BIT-ON' at the position you want to check
//        for eg, we want to check the first bit so, AND the number with 1 (...0001 in binary), operator used - &
//        if you want to check third bit, AND the number with 4 (...0100 in binary )

//        Code - this is efficient approach
          if((a & 1)==0){
              System.out.println("Number is even");
          }else{
              System.out.println("Number is odd");
          }
    }
}
