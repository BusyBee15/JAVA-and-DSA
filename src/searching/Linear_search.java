package searching;

import java.util.Scanner;

public class Linear_search {
    public static void main(String[] args) {
        int[] nums = {1,45,823,72,-48,2,685,3};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = input.nextInt();
        System.out.println(search(nums,n));

        String s = "I love learning";
        System.out.println("enter the character");
        char c = input.next().trim().charAt(0);
        System.out.println(search(s, c));

    }

//    search in the array, return the index if element is found
//    else return -1;
    private static int search(int[] arr, int element){
        if(arr.length==0) return -1;

        for(int i=0; i<arr.length; i++){
            if(arr[i]==element){
                return i;
            }
        }
//        this line will execute only if no return happened
//        in for loop - meaning element not found
        return -1;
    }

//    method overloading
    private static int search(String s, char c){
        if(s.length()==0) return -1;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==c){
                return i;
            }
        }

        return -1;
    }
}
