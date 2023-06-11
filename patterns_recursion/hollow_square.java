// * * * * *
// *       *
// *       *
// *       *
// * * * * *

import java.util.Scanner;

public class hollow_square {

    public static void hollowsquare(int i, int j, int n, String s1, String s2) {
        if (i > n && j > n) {
            return;
        }
        if (i > n && (j == n || j == 1)) {
            System.out.println(s1);
            hollowsquare(i, j + 1, n, s1, s2);
        } else if (i > n && (j != n || j != 1)) {
            System.out.println(s2);
            hollowsquare(i, j + 1, n, s1, s2);
        } else {
            if (i == 1 || i == n)
                s2 += "* ";
            else
                s2 += "  ";
            s1 += "* ";
            hollowsquare(i + 1, j, n, s1, s2);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Square pattern size : ");
        int n = sc.nextInt();
        hollowsquare(1, 1, n, "", "");
        sc.close();
    }
}
