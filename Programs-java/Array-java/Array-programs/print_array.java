// write a program to print the array as it is given by the user

// import java.util.Scanner;

// public class print_array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Size of the list: ");
//         int size =sc.nextInt();
//         int[] number = new int[size];

//         System.out.println("Enter the elements according to list size...");
//         for (int i=0; i<size; i++) {
//             number[i] = sc.nextInt();
//         }

//         System.out.println("The given list is below...");
//         for(int i=0; i<size; i++) {
//             System.out.print(number[i]+ ",");
//             sc.close();
//         }
//     }
// }



// write a program to print the 2D array as it is but input given by the user

import java.util.Scanner;

public class print_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the row size: ");
        int row = sc.nextInt();
        System.out.print("Enter the col size: ");
        int col = sc.nextInt();

        int num[][]=new int[row][col];

        System.out.println("Enter the row and col one by one....");
        for (int i=0; i<row; i++) {
            for (int j=0; j<col; j++) {
                num[i][j]=sc.nextInt();
            }
        }

        for (int i=0; i<row; i++) {
            for (int j=0; j<col; j++) {
                System.out.print(num[i][j] + " ");
                    sc.close();
                }
            }
        }
    }
