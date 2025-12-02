//check an array is sorted or not (if it is sorted then return true or return false)

import java.util.Scanner;
public class recursion_9 {
    public static boolean arr_sort (int arr[], int idx) {
        if (idx==arr.length-1) {
            return true;
        }
        if (arr[idx]<arr[idx+1]) {
            return arr_sort (arr,idx+1);
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.print("Enter the array size: ");
        int n = sc.nextInt();

        System.out.println("enter the elements one by one.....");
        int arr[]=new int[n];

        for (int i=0; i<arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        System.out.print (arr_sort(arr, 0));
        sc.close();
    }
}
