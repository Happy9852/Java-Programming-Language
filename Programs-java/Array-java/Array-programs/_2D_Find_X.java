////write a program to find a element position from given 2D array list



// import java.util.Scanner;

// public class input_user {
//     public static void main (String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter count of rows: ");
//         int rows = sc.nextInt();
//          System.out.print("Enter count of columns: ");
//         int cols = sc.nextInt();

        
//         int[][] numbers =new int [rows][cols];

//          System.out.println("Enter rows and column elements....");
//         for (int i=0; i<rows; i++) {
//             for(int j=0; j<cols; j++) {
//                 numbers[i][j] = sc.nextInt();
//             }
//         }

//         System.out.println("This is output matrix.....");
//         for(int i=0; i<rows; i++) {
//             for (int j=0; j<cols; j++) {
//                 System.out.print(numbers[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }


import java.util.Scanner;

public class _2D_Find_X {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter count of rows: ");
        int rows = sc.nextInt();
         System.out.print("Enter count of columns: ");
        int cols = sc.nextInt();

        
        int[][] numbers =new int [rows][cols];

         System.out.println("Enter rows and column elements....");
        for (int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter x value to find: ");
        int x = sc.nextInt();

        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                if (numbers[i][j] == x) {
                    System.out.println("x fount at the location of (" + i + "," + j + ")");
                    sc.close();
                }
            }
        }
    }
}
