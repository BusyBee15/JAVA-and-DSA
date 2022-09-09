package searching;

import java.util.Scanner;

public class Order_Agnostic_Binary_Search {
    public static void main(String[] args) {
        int[] asc = {1,2,3,4,5,6,7,8,9,10};
        int[] desc = {10,9,8,7,6,5,4,3,2,1};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = input.nextInt();

        System.out.println(search(asc, n));
        System.out.println(search(desc, n));




    }

    private static int search(int[] arr, int target){
        int start = 0, end = arr.length-1;

        boolean ascOrDesc = arr[0] < arr[arr.length-1];
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target == arr[mid]) return mid;
            else if(target > arr[mid]){
                if(ascOrDesc) start = mid + 1;
                else end = mid-1;
            }
            else{
                if(ascOrDesc) end = mid-1;
                else start = mid + 1;
            }
        }

        return -1;

    }
}
