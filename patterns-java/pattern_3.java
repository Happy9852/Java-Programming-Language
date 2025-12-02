// x 
// x x
// x x x
// x x x x
// x x x x x
// x x x x x x
// x x x x x x x
// x x x x x x x x

public class pattern_3 {
    public static void main (String[] args) {

        int n=8;

        for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print("x ");
            }
            System.out.println();
        }
    }
}
