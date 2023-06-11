//                 *
//             * *
//         * * *
//     * * * *
// * * * * *
// * * * * * *
// * * * * *
//     * * * *
//         * * *
//             * *
//                 *

import java.util.Scanner;

public class eagle {
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
        stars(star - 1);

    }

    public static void eaglepattern(int n, int num) {
        if (n == 0){
            stars(num - n + 1);
            return;
        }
        spaces(n - 1);
        spaces(n - 1);
        stars(num - n + 1);
        System.out.println();
        eaglepattern(n - 1, num);
        System.out.println();
        spaces(n - 1);
        spaces(n - 1);
        stars(num - n + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pattern size : ");
        int n = sc.nextInt();
        eaglepattern(n, n);
        sc.close();
    }
}
