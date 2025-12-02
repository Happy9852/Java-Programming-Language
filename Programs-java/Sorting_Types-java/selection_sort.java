// selection sort

public class selection_sort {
    public static void selection_sort_1 (int arr[]) {
        System.out.print("After seclection sort used: ");
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {

        int arr[] = {7,4,2,9,1};

        for (int i=0; i<arr.length-1; i++) {
            int smallest = i;
            for (int j=i+1; j<arr.length; j++) {
                if (arr[smallest]>arr[j]) {
                    smallest=j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i]=temp;
        }
        selection_sort_1(arr);
    }
}


// list given by user

// import java.util.Scanner;

// public class selection_sort {
//     public static void print_seclection_sort (int arr[]) {
//         System.out.print("After the selection sort: ");
//         for (int i=0; i<arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
//     public static void main (String[] args) {
//         Scanner sc = new Scanner (System.in);

//         System.out.print("Enter the size of the array list: ");
//         int n = sc.nextInt();

//         int arr[]=new int[n];

//         System.out.println("Enter the elelments one by one...");
//         for (int i=0; i<n; i++) {
//             arr[i]=sc.nextInt();
//         }

//         for (int i=0; i<arr.length-1; i++) {
//             int smallest = i;
//             for (int j=i+1; j<arr.length; j++) {
//                 if (arr[smallest]>arr[j]) {
//                 smallest = j;
//             }
//         }
//         int temp = arr[smallest];
//         arr[smallest] = arr[i];
//         arr[i]=temp;
//         }
//         print_seclection_sort(arr);
//         sc.close();
//     }
// }
