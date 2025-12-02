/*two numbers are entered by the user extend n write a function
to find the value of one number raised to the power of the another*/

import java.util.Scanner;

public class practice_7 {
    public static double power(double base , double exponent){
        return Math.pow(base, exponent);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter base value: ");
        double base = sc.nextDouble();

        System.out.print("Enter the exponent: ");
        double exponent = sc.nextDouble();

        System.out.println(power(base,exponent));
        sc.close();
    }
}
