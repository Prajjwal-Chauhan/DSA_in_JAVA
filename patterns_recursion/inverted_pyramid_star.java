// * * * * * * *
//   * * * * *
//     * * *
//       *

import java.util.Scanner;

public class inverted_pyramid_star {
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

    public static void invertedpyramid(int n, int num) {
        if (n <= 0)
            return;
            invertedpyramid(n - 2, num);
            spaces(n - 2);
            stars(num - n);
            System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pattern first row size : ");
        int n = sc.nextInt();
        invertedpyramid(n, n);
        sc.close();
    }
}
