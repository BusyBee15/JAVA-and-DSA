package gettingComfortable;

import java.util.Scanner;

//question
//To find out whether the given String is Palindrome or not.
public class program8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the string");
        String inputString = input.next();

        int i=0, j=inputString.length()-1;
        while(i<j){
            if(inputString.charAt(i)!=inputString.charAt(j)){
                System.out.println("Not a palindrome");
                break;
            }
            i++; j--;
        }
        System.out.println("Given string ia a palindrome");
    }
}
// charAt(i) function of Strings class returns the character at ith position in the string
// for palindrome, corresponding characters from first and last in the string should match
// so take two pointers and keep checking until a mismatch occurs or the indices cross - indicating it is a palindrome