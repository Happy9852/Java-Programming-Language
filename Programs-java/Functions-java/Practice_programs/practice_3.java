// write a function which takes 2 numbers and return greatest of those two numbers

import java.util.Scanner;

public class practice_3 {
    public static void greatest_num(int a, int b) {

        if(a<b){
            System.out.println("b is greatest");
        }else {
            System.out.println("a is greatest");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a value: ");
        int a = sc.nextInt();
        System.out.print("Enter b value: ");
        int b = sc.nextInt();

        greatest_num(a,b);
        sc.close();
    }
}
    
