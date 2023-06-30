import java.util.ArrayList;

public class addition_subtraction {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        int[] arr1 = {0,2,7,4};
        int[] arr2 = {5,4,4,5};
        int carry = 0;
        int n = arr1.length;

        // addition
        for(int i = 0 ; i < n ; i++){
            if(i == n-1) arr.add(0,carry + (arr1[n-i-1] + arr2[n-i-1]));
            else{
                arr.add(0,carry + (arr1[n-i-1] + arr2[n-i-1])%10);
                carry = (arr1[n-i-1] + arr2[n-i-1])/10;
            }
        }
        
        System.out.println("Addition : "+arr);
        arr.clear();
        
        // subtraction

        for(int i = n-1; i > 0 ; i--){
            if(arr2[i] > arr1[i]) {
                arr1[i-1]--;
                arr1[i] += 10;
            }
            arr.add(0,arr1[i] - arr2[i]);
        }

        arr.add(0,arr1[0] - arr2[0]);
        System.out.println("Subtraction : "+arr);

    }
}
