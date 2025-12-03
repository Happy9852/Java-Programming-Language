//   n denotes rows : n=2;
//   num denots which number to start : num=1
//   1 
// 2 3 4
//   5


import java.util.Scanner;

public class pattern_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the n value: ");
        int n = sc.nextInt();
        System.out.print("Eter the num value: ");
        int num = sc.nextInt();

        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n-i; j++) {
                System.out.print("  ");
            }
            for (int j=1; j<=2*i-1; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
        for (int i=n-1; i>=1; i--) {
            for (int j=1; j<=n-i; j++) {
                System.out.print("  ");
            }
            for (int j=1; j<=2*i-1; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
            sc.close();
        }
    }
}