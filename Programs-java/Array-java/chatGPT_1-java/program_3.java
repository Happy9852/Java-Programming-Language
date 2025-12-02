// Program to find the largest number in an array.

// public class program_3 {
//     public static void main (String[] args) {
//         int arr[] = {99,77,45,22,67};
//         int max = arr[0];

//         for (int i=0; i<arr.length; i++) {
//             if (arr[i] < max) {
//                 max = arr[i];
//             }  
//         }
//         System.out.print("max value is: " + max);
//     }
// }


//Write a Java program to read an array of integers and find the largest (maximum) number in the array.
// Your program should accept the array values as user input.
// Then it should compare the elements and print the largest value.


import java.util.Scanner;

public class program_3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the size of the list: ");
        int n = sc.nextInt();
        
        int arr[] = new int[n];

        System.out.println("Enter the elements in the list one by one....");
        for (int i=0; i<arr.length; i++) {
            arr[i]=sc.nextInt();
            System.out.print(arr[i]+" ");
        }

        int max = arr[0];

        System.out.println();
        for (int i=0; i<n; i++) {
            if (arr[i]>max) {
                max = arr[i];
            }
        }
        System.out.println("max value is: " + max);
        sc.close();
    }
}