//Program to find the sum of all elements in an array.

// public class program_2 {
//     public static void main (String[] args) {
//         int arr[] = {5,10,15,20,25};

//         int sum=0;

//         for (int i=0; i<arr.length; i++) {
//             sum = sum + arr[i];
//         }
//         System.out.print("sum of all elements in tha array is: "+sum);
//     }
// }



// same program but i will give input at output screnne

import java.util.Scanner;

public class program_2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of the array...");
        int n = sc.nextInt();

        int arr[] = new int[n];
        int sum=0;

        System.out.println("Enter " + n + " elements one by one...");
        for (int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        System.out.println("sum of the all elements in array is: " + sum);
        sc.close();
    }
}