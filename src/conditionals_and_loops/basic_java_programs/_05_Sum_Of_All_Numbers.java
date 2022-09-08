package conditionals_and_loops.basic_java_programs;

import java.util.Scanner;

//question
//Take integer inputs till the user enters 0
// and print the sum of all numbers (HINT: while loop)
public class _05_Sum_Of_All_Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0, n;
        System.out.println("Enter the integer");
        while((n=input.nextInt())!=0){
            sum += n;
            System.out.println("Enter the integer");
        }
        System.out.println("Result is" + " " + sum);
    }
}
