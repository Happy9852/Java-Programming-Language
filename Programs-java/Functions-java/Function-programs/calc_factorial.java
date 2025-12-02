import java.util.*;

public class calc_factorial {
    public static int calculate_factorial(int n) {
        if (n < 0) {
            System.out.println("Factorial is not defined for nagative numbers.. ");
            return 0;
        }

        int factorial =1;

        for (int i=n; i>=1; i--) {
            factorial = factorial * i;
        }
        System.out.println ("The factorial of given number is: " + factorial);
        return factorial;
    }
    
    public static void main (String [] args) {
        Scanner sc =new Scanner (System.in);
        int n = sc.nextInt();

        System.out.println(calculate_factorial(n));
        sc.close();
        return;
    }
}
