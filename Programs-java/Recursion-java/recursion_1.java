// write a program to print 1 to 5 numbers using recursion

// public class recursion_1 {
//     public static void print_num (int n) {
//         if (n==6) {
//             return;
//         }
//         System.out.println(n);
//         print_num(n+1);
//     }
//     public static void main (String[] args) {
//         int n = 1;
//         print_num(n);
//     }
// }




// write a program to print 1 to 5 numbers using recursion but n given by user at output screen

import java.util.Scanner;

public class recursion_1 {
    public static void print_num(int n) {
        if (n == 6) {
            return;
        }
        System.out.println(n);
        print_num(n+1);
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = sc.nextInt();

        print_num(n);
        sc.close();
    }
}
