//Write a Java program to count how many even and odd numbers are in an array.
// public class program_5 {
//     public static void main (String[] args) {
//         int arr[] = {1,2,3,4,5,6,7,8,9,10};
//         int even_num=0;
//         int odd_num=0;

//         for (int i=0; i<arr.length; i++) {
//             if (arr[i]%2==0) {
//                 even_num++;
//             } else {
//                 odd_num++;
//             }
//         }
//         System.out.println("The even number count is: " + even_num);
//         System.out.println("The odd number count is: " + odd_num);
//     }
// }




// print even and odd number count using array and array list given by the user at output screen

import java.util.Scanner;

public class program_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int even_num = 0;
        int odd_num = 0;


        int arr[] = new int[n];

        System.out.println("Enter the elements into the array list...");
        for (int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i=0; i<n; i++) {
            if (arr[i]%2==0) {
                even_num++;
            } else {
                odd_num++;
            }
        }
        System.out.println("Count of even_number is: " + even_num);
        System.out.println("Count of odd_number is: " + odd_num);
        sc.close();
    }
}