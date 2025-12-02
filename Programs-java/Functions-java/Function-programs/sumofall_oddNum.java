// This is program that takes the stoping condition from the user and print the sum of odd numbers

import java.util.Scanner;

public class sumofall_oddNum {
    public static int sum_of_all_oddnum(int n) {
        int sum = 0;
        for (int i=1; i<=n; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter n value: ");
        int n = sc.nextInt();

        System.out.println("Sum of given odd number is: "+sum_of_all_oddnum(n));
        sc.close();
    }
}
