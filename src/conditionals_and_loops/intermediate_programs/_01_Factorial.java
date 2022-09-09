package conditionals_and_loops.intermediate_programs;

import java.util.Scanner;

//question
//find the factorial of a given number
public class _01_Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the integer");
        int n = input.nextInt();

        System.out.println(n+"! = "+factorial(n));
    }

    private static int factorial(int n){
        if(n==0||n==1) return 1;
        else return n * factorial(n-1);
    }
}
