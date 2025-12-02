// bubble sort example program in java

// public class bubble_sort {
//     public static void printarray (int arr[]) {
//         for (int i=0; i<arr.length; i++) {
//             System.out.print(arr[i]+" ");
//         }
//     }
//     public static void main (String[] args) {

//         int arr[]={5,4,3,2,1};

//         for (int i=0; i<arr.length-1; i++) {
//             for (int j=0; j<arr.length-1-i; j++) {
//                 if (arr[j]>arr[j+1]) {
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                 }
//             }
//         }
//         printarray(arr);
//     }
// }



// same here but list provided by usr

import java.util.Scanner;

public class bubble_sort {
    public static void print_array(int arr[]) {
        System.out.print("After sorting the list: ");
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the size of the list: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the elements one by one...");
        for (int i=0; i<arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        
        for (int i=0; i<n-1; i++) {
            for (int j=0; j<n-1-i; j++) {
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        print_array(arr);
        sc.close();
    }
}
