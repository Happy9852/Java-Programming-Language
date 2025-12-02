/* Write a Java program that stores a predefined username and password.
 The program should take user input for a username and password and verify them. 
 If the credentials are incorrect, allow the user up to 5 additional login attempts. 
 After each attempt, display whether the login was successful or failed. */

import java.util.*;

public class practice_9 {
    public static void main(String[] args){

        String userName = "sai";
        String password = "Sai_123";

        Scanner sc = new Scanner (System.in);
        String user = sc.nextLine();
        String pass = sc.nextLine();

        if(user.equals(userName) && pass.equals(password)){
            System.out.println("Login Successful");
        }
        else{
            System.out.println("Login Failed");
        }

        for(int i=0; i<5; i++){
            System.out.println("Attempt " + (i+1) + ": Please enter your username and password");
            String userAttempt = sc.nextLine();
            String passAttempt = sc.nextLine();

            if(userAttempt.equals(userName) && passAttempt.equals(password)){
                System.out.println("Login Successful");
                break;
            }
            else{
                System.out.println("Login Failed");
                sc.close();
            }
        }
    }
}
