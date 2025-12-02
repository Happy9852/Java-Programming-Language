// write a function that takes in the radius as input and return the circumference of circle

import java.util.*;

public class practice_4 {

    public static double findCircumference(double radius) {
        return 2 * 3.14 *radius ;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        //double circumfernce = findCircumference(radius);

        System.out.println(findCircumference(radius));
        sc.close();
    }
}
