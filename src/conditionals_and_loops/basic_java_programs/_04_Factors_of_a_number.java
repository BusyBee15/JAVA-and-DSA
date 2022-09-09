package conditionals_and_loops.basic_java_programs;

import java.util.Scanner;

public class _04_Factors_of_a_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
//        brute force - O(n)
//        better approach - O(n/2)
//        time complexity = O(root(n))

        for(int i=1; i*i<=n; i++){
            if((n%i)==0){
                int temp = n/i;
                if(temp==i) System.out.print(","+temp);
                else System.out.print(","+ temp + ","+ i);
            }
        }

    }
}
