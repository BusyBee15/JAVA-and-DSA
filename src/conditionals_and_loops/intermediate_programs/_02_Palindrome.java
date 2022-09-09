package conditionals_and_loops.intermediate_programs;

import java.util.Scanner;

public class _02_Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the integer");
        int n = input.nextInt();

        if(reverse(n)==n) System.out.println("Palindrome");
        else System.out.println("Not a palindrome");

    }
    private static int reverse(int n){
        int reveredNum = 0;
        while(n>0){
            reveredNum = reveredNum*10 + (n%10);
            n/=10;
        }
        return reveredNum;
    }
}
