// This is simple function that prints name 

import java.util.*;

public class sim_func {
    public static void printmyName(String name) {
        System.out.println("Your nae is: " + name);
        return;
    }
    public static void main(String args[]) {
        System.out.print("Enter your name: ");
        Scanner sc = new Scanner (System.in);
        String name = sc.nextLine();

        printmyName(name);
        sc.close();
    }
}