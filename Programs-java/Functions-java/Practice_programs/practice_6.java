// write a progaram to print infinite loop using do-while loop

import java.util.*;

public class practice_6 {
    public static void main (String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the stoping condition: ");
        int n =sc.nextInt();

        int a=5;
        do {
            System.out.println(a);
            a--;;
        }while(a<=n);
        sc.close();
    }
}
