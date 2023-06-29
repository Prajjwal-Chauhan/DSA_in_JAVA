// package binary_search;

public class binary_search {
    public static void main(String[] args) {
        int arr[] = new int[]{10,20,30,40,50,60,70,80,90,100};
        int low = 0;
        int high = arr.length - 1;
        int searchElem = 0;

        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] == searchElem) {
                System.out.println("Element found at position : "+mid);
                return;
            }
            else if(arr[mid] < searchElem) low = mid + 1;
            else if(arr[mid] > searchElem) high = mid - 1;
        }

        System.out.println("Element not found");
    }
}
