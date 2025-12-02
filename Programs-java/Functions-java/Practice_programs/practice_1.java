//write a java program to print average os three numbers using function

import java.util.Scanner;

public class practice_1 {
    public static int ave_three(int a, int b, int c) {
        int average = (a + b + c) / 3;
        return average;
    }
    public static void main (String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.print("Enter 'a' value: ");
        int a = sc.nextInt();
        System.out.print("Enter 'b' value: ");
        int b = sc.nextInt();
        System.out.print("Enter 'c' value: ");
        int c = sc.nextInt();

        System.out.println("average of giveen three numbers is:  " + ave_three(a, b, c));
        sc.close();
    }
}
