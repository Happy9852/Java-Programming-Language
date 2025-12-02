//Write a Java program to find the second largest number in an array.

// public class program_8 {
//     public static void main(String[] args) {
        
//         int[] arr = {12, 45, 67, 23, 89, 34};
        
//         int largest = 0;
//         int secondLargest = 0;

//         for (int num : arr) {
//             if (num > largest) {
//                 secondLargest = largest;
//                 largest = num;
//             } 
//             else if (num > secondLargest && num != largest) {
//                 secondLargest = num;
//             }
//         }

//         System.out.println("Largest number = " + largest);
//         System.out.println("Second largest number = " + secondLargest);
//     }
// }



// Write a Java program to find the second largest number in an array.
// but array list given by the user at output screen


import java.util.Scanner;

public class program_8 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the size of the array: ");
        int n= sc.nextInt();

        int arr[] = new int[n];
        int first_largest=0;
        int second_largest=0;

        System.out.println("Enter the element one by one...");
        for (int i=0; i<arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        for (int i=0; i<arr.length; i++) {
            if (arr[i]>first_largest) {
                second_largest=first_largest;
                first_largest=arr[i];
            }
            else if (arr[i]>second_largest && arr[i] != first_largest){
                second_largest=arr[i];
            }
            
        }
        System.out.println("This largest value is: " + first_largest);
        System.out.print("This largest value is: " + second_largest);
        sc.close();
    }
}