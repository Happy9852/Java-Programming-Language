// write a program to print sum of first n numbers

public class recursion_2 {
    public static void cal_sum (int i, int n, int sum ) {
        if (i==n) {
            sum=sum+i;
            System.out.println(sum);
            return;
        }
        sum= sum+i;
        cal_sum(i+1, n, sum);
        System.out.println(sum);
    }
    public static void main (String[] args) {
        cal_sum(1, 5, 0);
    }
}