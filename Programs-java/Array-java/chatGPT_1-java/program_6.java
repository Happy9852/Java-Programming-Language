//Write a Java program to reverse an array.

// public class program_6 {
//     public static void main(String[] args) {

//         int arr[] = {1,2,3,4,5,6,7,8,9};

//         for (int i=arr.length-1; i>=0; i--) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }



// some program but array list given by the user at output screen

import java.util.Scanner;

public class program_6 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array list: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the elements one by one...");
        for (int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("After reversing the array the list is like below....");
        for (int i=arr.length-1; i>=0; i--) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}