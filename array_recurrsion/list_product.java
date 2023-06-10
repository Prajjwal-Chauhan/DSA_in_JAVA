import java.util.Scanner;

public class list_product {

    public static long productlist(int arr[],int i,int n){
        if(i >= n-1) return arr[i];

        return arr[i]*productlist(arr, i+1, n);
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

        System.out.println(productlist(arr,0,n));
    }
}
