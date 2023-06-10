// package array_recurrsion;

import java.util.Scanner;

public class highest_element {

    private static int maximum = Integer.MIN_VALUE;
    public static void max(int arr[],int i,int n){
        if(i>=n) return;
        if(maximum < arr[i]) maximum = arr[i];
        max(arr,i+1,n);
    } 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of num list : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        System.out.print("Enter elements of num list : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        max(arr,0,arr.length);
        System.out.println(maximum);
        sc.close();
    }
}
