// write a functio to print the sum of all dd numbers from 1 to n

import java.util.Scanner;

public class practice_2 {
    public static int sum_odd_num(int n) {
        int sum = 0;
        for (int i=1; i<=n; i++){
            if (i%2==1){
                sum=i+sum;
            }
        }
        return sum;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Give me the n value: ");
        int n = sc.nextInt();

        System.out.println("The sum of n numbers is: " + sum_odd_num(n));
        sc.close();
    }
}
