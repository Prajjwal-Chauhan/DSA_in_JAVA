import java.util.Scanner;
import java.util.*;

public class third_largest {
    
public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size : "); 
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements : ");

        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.println(arr[n-3]);

         sc.close();
    }
}