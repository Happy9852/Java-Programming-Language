/*Write a Java program that asks the user to enter a past number of days and
 displays what day of the week it was that many days ago.*/

import java.time.LocalDate;
import java.time.DayOfWeek;
import java.util.Scanner;

public class practice_10 {
    public static void main(String[] args) {
        // Get current date
        LocalDate today = LocalDate.now();
        DayOfWeek currentDay = today.getDayOfWeek();
        
        System.out.println("Today is: " + currentDay);
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of days to add: ");
        int daysToAdd = sc.nextInt();
        
        // Calculate future date
        LocalDate futureDate = today.plusDays(daysToAdd);
        DayOfWeek futureDay = futureDate.getDayOfWeek();
        
        System.out.println("After " + daysToAdd + " days, it will be: " + futureDay);
        System.out.println("That date will be: " + futureDate);
        
        sc.close();
    }
}