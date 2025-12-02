//write a program to find a element position from given array list

import java.util.Scanner;

public class Find_X {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int size =sc.nextInt();
        int[] number = new int[size];
        
        System.out.println("Enter the elements of the array");
        for (int i=0; i<size; i++) {
            number[i] = sc.nextInt();
        }
        System.out.print("Enter the value of X to find:");
        int X = sc.nextInt();

        for(int i=0; i<number.length; i++) {
            if (number[i]==X) {
                System.out.println("X found at index: " + i);
                sc.close();
            }
        }
    }
}
