//     *
//   * * *
// * * * * *
//   * * *
//     *

import java.util.Scanner;

public class fullPyramid {

    public static void spaces(int space) {
        if (space < 0)
            return;
        System.out.print(" ");
        spaces(space - 1);
    }

    public static void stars(int star) {
        if (star < 0)
            return;
        System.out.print("* ");
        stars(star - 1);

    }

    public static void fullpyramid(int n, int num) {
        if (n <= 0)
            return;

        spaces(n - 2);
        stars(num - n);
        System.out.println();
        fullpyramid(n - 2, num);
        spaces(n);
        stars(num - n - 2);
        System.out.println();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pattern size : ");
        int n = sc.nextInt();
        fullpyramid(n, n);
        sc.close();
    }
}
