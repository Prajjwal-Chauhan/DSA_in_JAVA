//       *
//     * * *
//   * * * * *
// * * * * * * *

import java.util.Scanner;

public class odd_pyramid {

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

    public static void oddpyramid(int n, int num) {
        if (n <= 0)
            return;
        spaces(n - 2);
        stars(num - n);
        System.out.println();

        oddpyramid(n - 2, num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pattern last row size : ");
        int n = sc.nextInt();
        oddpyramid(n, n);
        sc.close();
    }
}
