// package array_recurrsion;
import java.util.Scanner;

public class salary_updated_tax {
    public static void salarytax(double arr[],int i,int n){
        if(i >= n) return;
        arr[i] = arr[i] + arr[i]*0.1;

        salarytax(arr, i+1, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of salary list : ");
        int n = sc.nextInt();
        double arr[] = new double[n];
        
        System.out.print("Enter elements of salary list : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextDouble();
        }

        salarytax(arr, 0, n);

        for (double d : arr) {
            System.out.println(d);
        }
        sc.close();
}
}
