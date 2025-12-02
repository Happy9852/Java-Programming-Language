//write a program to print sum of two numbers using functions

import java.util.Scanner;

public class calculate_sum {
    public static int calculate_Sum(int a, int b) {
        return a + b;
    }

    public static void main(String [] args) {
        Scanner num =new Scanner (System.in);
        System.out.print("Enter a value: ");
        int a = num.nextInt();
        System.out.print("Enter b value: ");
        int b = num.nextInt();

        System.out.println("The sum of given 2 numbers is: " + calculate_Sum(a,b));
        num.close();
    }
}
