// x                 x 
// x x             x x
// x x x         x x x
// x x x x     x x x x
// x x x x x x x x x x
// x x x x x x x x x x
// x x x x     x x x x
// x x x         x x x
// x x             x x
// x                 x


public class pattern_11 {
    public static void main (String[] args) {
        int n=5;

        for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print("x ");
            }
            int space = 2*(n-i);
            for (int j=1; j<=space; j++) {
                System.out.print("  ");
            }
            for (int j=1; j<=i; j++) {
                System.out.print("x ");
            }
            System.out.println();
        }

        for (int i=n; i>=1; i--) {
            for (int j=1; j<=i; j++) {
                System.out.print("x ");
            }
            int space = 2*(n-i);
            for (int j=1; j<=space; j++) {
                System.out.print("  ");
            }
            for (int j=1; j<=i; j++) {
                System.out.print("x ");
            }
            System.out.println();
        }
    }
}
