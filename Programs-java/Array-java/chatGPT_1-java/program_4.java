//Write a Java program to find the smallest number in an array.

// public class program_4 {
//     public static void main(String [] args) {
//         int arr[] = {66,77,23,87,93};
//         int min = arr[0];

//         for (int i=0; i<arr.length; i++) {
//             if (arr[i]<min) {
//                 min = arr[i];
//             }
//         }
//         System.out.println("least number is: " + min);
//     }
// }





// find the smallest element form the array and array list provided by the user in output screen

import java.util.Scanner;

public class program_4 {
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

        int min = arr[0];

        System.out.println();
        for (int i=0; i<n; i++) {
            if (arr[i]<min) {
                min = arr[i];
            }
        }
        System.out.println("min value is: " + min);
        sc.close();
    }
}