package searching;

import java.util.Scanner;

public class Binary_Search {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = input.nextInt();

        int index = search(arr, n);
        if(index==-1) System.out.println("target is not present in the array");
        else System.out.println("target is present at index "+""+index);
    }

    private static int search(int[] arr, int target){
        int start = 0, end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(target == arr[mid]) return mid;
            else if(target > arr[mid]) start = mid + 1;
            else end = mid-1;
        }

//     nothing has been returned , that means element doesn't exist, return -1
        return -1;
    }

//    recursive version
    private static int search(int[] arr, int target, int start, int end){
        if(start>end) return -1;

        int mid = start + (end-start)/2;
        if(arr[mid]==target) return mid;
        else if(arr[mid]>target) return search(arr, target, start, mid-1);
        else return search(arr, target, mid+1, end);
    }
}
