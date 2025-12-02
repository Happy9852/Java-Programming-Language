//Write a Java program to copy one array into another array.

// public class program_10 {
//     public static void main(String[] args) {

//         int[] arr1 = {10, 20, 30, 40, 50};
//         int[] arr2 = new int[arr1.length];

//         for (int i = 0; i < arr1.length; i++) {
//             arr2[i] = arr1[i];
//         }

//         System.out.println("Elements of original array:");
//         for (int i = 0; i < arr1.length; i++) {
//             System.out.print(arr1[i] + " ");
//         }

//         System.out.println("\nElements of copied array:");
//         for (int i = 0; i < arr2.length; i++) {
//             System.out.print(arr2[i] + " ");
//         }
//     }
// 



// same but array list is given by the user at output screen

import java.util.Scanner;

public class program_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the array size: ");
        int n =sc.nextInt();

        int arr[]=new int[n];

        System.out.println("Enter the elements one by one ....");
        for (int i=0; i<arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        int arr1[] = new int[arr.length];

        for (int i=0; i<arr.length; i++) {
            arr1[i]=arr[i];
        }
         System.out.println("Elements of original array:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println("\nElements of copied array:");
         for (int i = 0; i < arr1.length; i++) {
             System.out.print(arr1[i] + " ");
        }
        sc.close();
    }
}