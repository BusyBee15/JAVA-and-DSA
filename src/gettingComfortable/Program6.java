package gettingComfortable;

import java.util.Scanner;

//question 6
//Input currency in rupees and output in USD.
public class Program6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the integer");
        int rupees = input.nextInt();

        System.out.println("$"+""+ String.format("%.4f",rupees/79.72));
    }

}
