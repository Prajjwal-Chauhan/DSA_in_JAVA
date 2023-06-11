//         *
//       *
//     *
//   *
// *

import java.util.Scanner;

public class diagonal {

    public static void spaces(int space) {
        if (space == 0)
            return;
        System.out.print("  ");
        spaces(space - 1);
    }

    public static void stars(int star) {
        if (star == 0)
            return;
        System.out.print("* ");
        spaces(star - 1);

    }

    public static void diagonalpattern(int n, int num) {
        if (n == 0)
            return;
        spaces(n - 1);
        stars(num - n + 1);
        System.out.println();

        diagonalpattern(n - 1, num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pattern size : ");
        int n = sc.nextInt();
        diagonalpattern(n, n);
        sc.close();
    }
}
