package conditionals_and_loops.basic_java_programs;

import java.util.Scanner;

//question
//Take integer inputs till the user enters 0 and print the largest number from all.
public class _06_Largest_of_All {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int max = 0, n;
        System.out.println("Enter the integer");
        while((n=input.nextInt())!=0){
            max = Math.max(n, max);
            System.out.println("Enter the integer");
        }
        System.out.println("Result is" + " " + max);
    }
}
