import java.util.Scanner;

public class number_char {
    public static void numberchar(int i, int n, String s) {
        if (i > n)
            return;
        s += i+" ";
        System.out.println(s);
        numberchar(i + 1, n, s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pattern size : ");
        int n = sc.nextInt();
        numberchar(1, n, "");
        sc.close();
    }
}
