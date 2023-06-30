public class rotata_array {

    static void reverse(int arr[] , int low , int high){
        while(low < high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
    public static void main(String[] args) {
        int rotate_array = 4;
        int arr[] = {10,20,30,40,50};
        rotate_array %= arr.length;
        reverse(arr,0,arr.length - 1 - rotate_array);
        reverse(arr,arr.length - rotate_array,arr.length - 1);
        reverse(arr, 0, arr.length - 1);

        for (int i : arr) {
            System.out.print(i +" ");
        }
    }
}
