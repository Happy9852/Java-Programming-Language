// caluculate average of three number using functions

import java.util.Scanner;

public class average {
    public static float calculate_average (int a, int b, int c) {
        int average = (a + b + c) / 3;
        return average;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int a =sc.nextInt();
        System.out.print("Enter b value: ");
        int b =sc.nextInt();
        System.out.print("Enter c value: ");
        int c =sc.nextInt();

         System.out.println(calculate_average(a, b, c));
         sc.close();
    }
}
