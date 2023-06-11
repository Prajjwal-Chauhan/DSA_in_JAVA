import java.util.Scanner;

/**
 * star_square
 */

// * * * * *
// * * * * *
// * * * * *
// * * * * *
// * * * * *

public class star_square {

    public static void starsquare(int i, int j, int n, String s) {
        if (i > n && j > n) {
            return;
        }
        if (i > n && j <= n) {
            System.out.println(s);
            starsquare(i, j + 1, n, s);
        } else {
            s += "* ";
            starsquare(i + 1, j, n, s);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Square pattern size : ");
        int n = sc.nextInt();
        starsquare(1, 1, n, "");
        sc.close();
    }
}