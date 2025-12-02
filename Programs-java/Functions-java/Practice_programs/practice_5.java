/*write a program that is in take age is ainput and returns if thet person is eligible to 
vote are not */ 

import java.util.*;

public class practice_5 {
    public static void age_person(int age) {
        if (age>=18) {
            System.out.print("This person can vote");
        }else {
            System.out.println("This person not able to vote");
        }

    }
    public static void main (String[] args){
        Scanner sc =new Scanner (System.in);

        System.out.print("Enter person's age: ");
        int age = sc.nextInt();

        age_person(age);
        sc.close();
    }
}
