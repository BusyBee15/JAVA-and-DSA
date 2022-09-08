package gettingComfortable;

import java.util.Scanner;

//question
// To find Armstrong Number between two given number.
public class Program9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first integer");
        int num1 = input.nextInt();

        System.out.println("Enter the second integer");
        int num2 = input.nextInt();

        for(int i=num1; i<num2; i++){
            if(isEquals(i, getLength(i))) System.out.print(i+""+",");
        }


    }

    private static boolean isEquals(int n, int digits){
        int sum=0;
        while(n>0){
            int last = n%10;
            n=n/10;
            sum = sum + (int)Math.pow(last, digits);
        }
        System.out.println(sum);
        if(sum==n) return true;
        return false;
    }

    private static int getLength(int n){
        return String.valueOf(n).length();

//        or
//        int length=0;
//        while(n>0){
//            length++;
//            n=n/10;
//        }
//        return length;
//
    }
}
