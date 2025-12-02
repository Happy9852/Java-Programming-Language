//Write a Java program to search a number in an array (linear search).

public class program_7 {
    public static void main(String[] args) {
        int arr[] = {2,3,5,1,4,7,6,7};
        int X =1;

        for (int i=0; i<arr.length; i++) {
            if (X==arr[i]) {
                System.out.println(i);
            }
        }
    }
}



// same program but with user input

// import java.util.Scanner;

// public class program_7 {
//     public static void main (String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.print("Enter the size of the array: ");
//         int n = sc.nextInt();

//         int arr[] = new int[n];

//         System.out.println("Enter the elements onr by one...");
//         for (int i=0; i<arr.length; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.print("Enter the element which is find form that arr list: ");
//         int X = sc.nextInt();

//         for (int i=0; i<n; i++) {
//             if (X==arr[i]) {
//                 System.out.print("The element found at: " + i);
//             }
//         }
//         sc.close();
//     }
// }