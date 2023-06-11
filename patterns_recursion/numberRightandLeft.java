// 1                  1
// 1 2              2 1
// 1 2 3          3 2 1
// 1 2 3 4      4 3 2 1
// 1 2 3 4 5  5 4 3 2 1

import java.util.Scanner;

public class numberRightandLeft {

    public static void spaces(int space) {
        if (space == 0)
            return;
        System.out.print("  "); 
        spaces(space - 1);
        System.out.print("  ");
    }

    public static void numberrightleft(int i, int n, StringBuilder sb) {
        if (i > n)
            return;
        sb.append(i + " ");
        System.out.print(sb.toString());
        spaces(n - i);
        sb.reverse();
        System.out.println(sb.toString());
        sb.reverse();
        numberrightleft(i + 1, n, sb);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pattern size : ");
        int n = sc.nextInt();
        numberrightleft(1, n, new StringBuilder());
        sc.close();
    }
}
