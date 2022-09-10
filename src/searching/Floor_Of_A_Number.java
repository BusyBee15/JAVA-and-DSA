package searching;

import java.util.Scanner;


//question
// Find the ceiling of a number -
// number which is less than or equal to the target element
public class Floor_Of_A_Number {
    public static void main(String[] args) {
        int[] arr = {2,4,6,67,78,90,134,569};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = input.nextInt();

        System.out.println(find(arr, n));
    }

    private static int find(int[] arr, int target){
        int start = 0, end = arr.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target) return target;
            else if(target < arr[mid]) end = mid-1;
            else start = mid+1;
        }

        if(end < 0) return -1;
        return arr[start];
    }

}
