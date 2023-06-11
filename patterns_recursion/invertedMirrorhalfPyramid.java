// * * * * *
//   * * * *
//     * * *
//       * *
//         *

import java.util.Scanner;

public class invertedMirrorhalfPyramid {

    public static void spaces(int space) {
        if (space == 0)
            return;
        spaces(space - 1);
        System.out.print("  ");
    }

    public static void stars(int star) {
        if (star == 0)
            return;
        stars(star - 1);
        System.out.print("* ");

    }

    public static void invertedmirrorhalfpyramid(int n, int num) {
        if (n == 0)
            return;

        invertedmirrorhalfpyramid(n - 1, num);
        spaces(n - 1);
        stars(num - n + 1);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pattern size : ");
        int n = sc.nextInt();
        invertedmirrorhalfpyramid(n, n);
        sc.close();
    }
}
