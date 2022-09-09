package conditionals_and_loops.intermediate_programs;

import java.util.Scanner;

//question
//find the lcm and hcf of two given numbers
public class _03_HCF_LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the positive integers");
        int num1 = input.nextInt();

        int num2 = input.nextInt();

        int product = (num1*num2);
//        Euclid's algo to find the GCD
//        gcd(a,b) = gdc(b, a%b), gcd(a,0)=a

//        to find LCM , use the relation between HCF and LCM
//        (a*b) = HCF * LCM
        int res = gcd(num1, num2);

        System.out.println("HCF is "+""+res+"\nLCM is "+""+(num1*num2)/res);
    }

    private static int gcd(int num1, int num2){
        if(num2==0) return num1;
        return gcd(num2, num1%num2);
    }
}
