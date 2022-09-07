package gettingComfortable;

import java.util.Scanner;

//question5
//Take 2 numbers as input and print the largest number.
public class program5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the integer");
        int num1 = input.nextInt();

        System.out.println("Enter the integer");
        int num2 = input.nextInt();

        if(num1 > num2) System.out.println(num1);
        else System.out.println(num2);


    }
}
