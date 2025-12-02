//         X X X X X   X X X X X 
//       X X X X X       X X X X X
//     X X X X X           X X X X X
//   X X X X X               X X X X X
// X X X X X                   X X X X X
//   X X X X X               X X X X X
//     X X X X X           X X X X X
//       X X X X X       X X X X X
//         X X X X X   X X X X X
//         X X X X X   X X X X X
//       X X X X X       X X X X X
//     X X X X X           X X X X X
//   X X X X X               X X X X X
// X X X X X                   X X X X X
//   X X X X X               X X X X X
//     X X X X X           X X X X X
//       X X X X X       X X X X X
//         X X X X X   X X X X X
//         X X X X X   X X X X X
//       X X X X X       X X X X X
//     X X X X X           X X X X X
//   X X X X X               X X X X X
// X X X X X                   X X X X X
//   X X X X X               X X X X X
//     X X X X X           X X X X X
//       X X X X X       X X X X X
//         X X X X X   X X X X X
//         X X X X X   X X X X X
//       X X X X X       X X X X X 
//     X X X X X           X X X X X
//   X X X X X               X X X X X
// X X X X X                   X X X X X
//   X X X X X               X X X X X
//     X X X X X           X X X X X
//       X X X X X       X X X X X 
//         X X X X X   X X X X X
//         X X X X X   X X X X X
//       X X X X X       X X X X X
//     X X X X X           X X X X X
//   X X X X X               X X X X X
// X X X X X                   X X X X X
//   X X X X X               X X X X X
//     X X X X X           X X X X X
//       X X X X X       X X X X X
//         X X X X X   X X X X X


public class pattern_18 {
    public static void main(String[] args) {
        int n=5;
        for (int k=1; k<=n; k++){
            for (int i=1; i<=n; i++) {
                for(int j=1; j<=n-i; j++) {
                    System.out.print("  ");
                }
                for (int j=1; j<=n; j++) {
                    System.out.print("X ");
                }
                for (int j=1; j<=2*i-1; j++) {
                    System.out.print("  ");
                }
                for (int j=1; j<=n; j++) {
                    System.out.print("X ");
                }
                System.out.println();
            }
            for (int i=n-1; i>=1; i--) {
                for(int j=1; j<=n-i; j++) {
                    System.out.print("  ");
                }
                for (int j=1; j<=n; j++) {
                    System.out.print("X ");
                }
                for (int j=1; j<=2*i-1; j++) {
                    System.out.print("  ");
                }
                for (int j=1; j<=n; j++) {
                    System.out.print("X ");
                }
                System.out.println();
            }
        }
    }
}
