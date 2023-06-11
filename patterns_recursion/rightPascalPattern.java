// *
// * *
// * * *
// * * * *
// * * * * *
// * * * *
// * * *
// * *
// *

import java.util.Scanner;

public class rightPascalPattern {

    public static void rightpascal(int i, int n, String s) {
        s += "* ";
        if (i >= n) {
            System.out.println(s);
            return;
        }
        System.out.println(s);
        rightpascal(i + 1, n, s);
        System.out.println(s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pattern size : ");
        int n = sc.nextInt();
        rightpascal(1, n, "");
        sc.close();
    }
}
