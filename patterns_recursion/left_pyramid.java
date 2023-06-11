//  *
//  * *
//  * * * 
//  * * * * 
//  * * * * *  

import java.util.Scanner;

public class left_pyramid {

    public static void leftpyramid(int i, int n, String s) {
        if (i > n)
            return;
        s += "* ";
        System.out.println(s);
        leftpyramid(i + 1, n, s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pattern size : ");
        int n = sc.nextInt();
        leftpyramid(1, n, "");
        sc.close();
    }
}
