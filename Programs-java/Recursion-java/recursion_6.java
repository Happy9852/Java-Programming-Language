// tower of hanoi formation

public class recursion_6 {
    public static void Hanoi(int n, String S, String H, String D) {
        if (n == 1) {
            System.out.println("Transfer disk 1 from " + S + " to " + D);
            return;
        }
        Hanoi(n - 1, S, D, H);
        System.out.println("Transfer disk " + n + " from " + S + " to " + D);
        Hanoi(n - 1, H, S, D);
    }

    public static void main(String[] args) {
        int n = 4;
        Hanoi(n, "S", "H", "D");
    }
}
