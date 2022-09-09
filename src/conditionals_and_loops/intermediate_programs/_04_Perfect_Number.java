package conditionals_and_loops.intermediate_programs;

import java.util.Scanner;

public class _04_Perfect_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the integer");
        int n = input.nextInt();

        if(factorsSum(n)==n) System.out.println("Perfect number");
        else System.out.println("oops!, not a perfect number");


    }

    private static int factorsSum(int n){
        int sum=1;
        for(int i=2; i*i<=n; i++){
            if((n%i)==0){
                int temp = n/i;
                sum = sum + i + temp;
            }
        }
        return sum;
    }
}
