package gettingComfortable;

import java.util.Scanner;

//question
//To calculate Fibonacci Series up to n numbers.
public class Program7 {
    public static void main(String[] args) {
//        fib series : 1,1,2,3,5,8..   F(n) = F(n-1) + F(n-2), n>=3
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the integer more than 1");
        long n = input.nextLong();

        System.out.print("1,1");
//
//        for(int i=3; i<=n; i++){
//            System.out.print("," + "" + fibfunc(i));
//        }
//        System.out.println(Arrays.toString(fibfun(n)));
        fibfun(n);
    }

//    private static long fibfunc(long n){
//        if(n==1 || n==2) return 1;
//        return fibfunc(n-1) + fibfunc(n-2);
//    }

//    private static long[] fibfun(long n){
//        long[] arr = new long[(int)n+1];
//
//        arr[0]=1; arr[1]=1;
//
//        for(int i=2; i<=n; i++){
//            arr[i] = arr[i-1] + arr[i-2];
//        }
//
//        return arr;
//    }

    private static void fibfun(long n){

       long temp1 = 1; long temp2 = 1;

       for(int i=2; i<n; i++){
            long next = temp1 + temp2;
            System.out.print(","+""+next);
            temp1 = temp2;
            temp2 = next;
        }


    }

}

//problem with above approach is that, even for small inputs it takes more time and
//for big inputs, at some point , it will give stack overflow

// if we draw the recursion tree for fib(5), we can see repetition, to avoid it
//we can follow bottom up approach, calculate smaller values first , store them and use them
// This is actually DP
