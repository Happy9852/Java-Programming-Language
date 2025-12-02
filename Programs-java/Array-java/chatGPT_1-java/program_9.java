//  Find the third largest value from the array list

// public class program_9 {
//     public static void main(String[] args) {
        
//         int[] arr = {12, 45, 67, 23, 89, 34, 78};
        
//         int first = Integer.MIN_VALUE;
//         int second = Integer.MIN_VALUE;
//         int third = Integer.MIN_VALUE;

//         for (int num : arr) {
//             if (num > first) {
//                 third = second;
//                 second = first;
//                 first = num;
//             }
//             else if (num > second && num != first) {
//                 third = second;
//                 second = num;
//             }
//             else if (num > third && num != second && num != first) {
//                 third = num;
//             }
//         }

//         System.out.println("1st largest = " + first);
//         System.out.println("2nd largest = " + second);
//         System.out.println("3rd largest = " + third);
//     }
// }




// some but array elements give by the user at output screen

import java.util.Scanner;

public class program_9 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the size of the array: ");
        int n= sc.nextInt();

        int arr[] = new int[n];
        int first_largest=0;
        int second_largest=0;
        int third_largest=0;

        System.out.println("Enter the element one by one...");
        for (int i=0; i<arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        for (int i=0; i<arr.length; i++) {
            if (arr[i]>first_largest) {
                third_largest=second_largest;
                second_largest=first_largest;
                first_largest=arr[i];
            }
            else if (arr[i]>second_largest && arr[i] != first_largest){
                third_largest=second_largest;
                second_largest=arr[i];
            }
            else if (arr[i]>third_largest && arr[i] != second_largest && arr[i] != first_largest) {
                third_largest=arr[i];
            }
            
        }
        System.out.println("This largest value is: " + first_largest);
        System.out.println("This second largest value is: " + second_largest);
        System.out.println("This third largest value is: " + third_largest);
        sc.close();
    }
}