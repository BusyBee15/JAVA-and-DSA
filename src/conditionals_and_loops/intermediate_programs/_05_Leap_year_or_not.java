package conditionals_and_loops.intermediate_programs;

import java.util.Scanner;

//question
//check is a given year is leap year or not
public class _05_Leap_year_or_not {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = input.nextInt();

//        order matters
//        if year is divisible by 4 and not divisible by 100, leap year
//        year is divisible by 400 , leap year
//        year is divisible by 100 and 400 , leap year
//        divisible by 100 but not by 400, not a leap year
        
        if((year%400)==0){
            System.out.println("leap year");
        }else if((year%100)==0) System.out.println("not a leap year");
        else if ((year%4)==0) {
            System.out.println("leap year");
        }else {
            System.out.println("not a leap year");
        }
    }
}
