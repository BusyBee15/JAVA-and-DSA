package gettingComfortable;

import java.util.Scanner;

//question
//Write a program to input principal, time,
// and rate (P, T, R) from the user and find Simple Interest
public class program3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//      principal
        System.out.println("Enter the principal amount");
        double principal = input.nextDouble();
//      rate
        System.out.println("Enter the rate");
        float rate = input.nextFloat();
//      time in years
        System.out.println("Enter the time in years");
        float time = input.nextFloat();

//      result
        double interest = principal*rate*time;
        System.out.println("Interest is "+ "" + String.format("%.2f", interest));

    }
}
