package gettingComfortable;

import java.util.Scanner;

//Question
//Take name as input and print a greeting message for that particular name.
public class program2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = input.nextLine();
        System.out.println(name);
    }
}
