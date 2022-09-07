package gettingComfortable;

import java.util.Scanner;

//question4
//Take in two numbers and an operator (+, -, *, /)
// and calculate the value. (Use if conditions)
public class program4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the integer");
        int num1 = input.nextInt();

        System.out.println("Enter the integer");
        int num2 = input.nextInt();

        System.out.println("Enter the operator : + or - or * or /");
        String opr = input.next();



        if(opr.equals("+")) System.out.println("Result is " + " " + num1+num2);
        if(opr.equals("-")) System.out.println("Result is " + " " + (num1-num2));
        if(opr.equals("*")) System.out.println("Result is " + " " + num1*num2);
        if(opr.equals("/")) System.out.println("Result is " + " " + num1/num2);


    }
}
