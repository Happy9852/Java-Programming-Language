// write a program to calculate factorial

public class recursion_3 {
    public static int factorial(int n) {
        if (n==0 || n==1) {
            return 1;
        }
        int fac_num1 = factorial(n-1);
        int fac_n = n*fac_num1;
        return fac_n;
    }
    public static void main(String[] args) {
        int n=5;
        int q = factorial(n);
        System.out.println(q);
    }
}
