//Program to print all elements of an array.

// public class program_1 {
//     public static void main (String[] args) {
//         int arr[] = {1,2,3,4,5,6,7};
        
//         System.out.println("This all are array elements given below");
//         for (int i=0; i<arr.length; i++) {
//             System.out.print(arr[i]+ " ");
//         }
//     }
// }


// If you want a version where the user enters the array values, here it is


import java.util.Scanner;

public class program_1 {
    public static void main (String args []) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements: ");
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("This is the array list you enterd");
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}