import java.util.Arrays;
import java.util.Scanner;

public class nth_largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter nth largest : "); 
        int m = sc.nextInt();
        System.out.print("Enter size : "); 
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements : ");

        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.println(m+"th largest number : "+arr[n-m]);

        sc.close();
    }
}
