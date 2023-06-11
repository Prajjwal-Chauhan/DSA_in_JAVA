// * * * * *
// * * * *
// * * *
// * *
// *

import java.util.Scanner;

public class inverted_halfPyramid {
    public static void invertedhalfpyramid(int i, int n, String s) {
        if (i > n)
            return;
        s += "* ";
        invertedhalfpyramid(i + 1, n, s);
        System.out.println(s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pattern size : ");
        int n = sc.nextInt();
        invertedhalfpyramid(1, n, "");
        sc.close();
    }
}
