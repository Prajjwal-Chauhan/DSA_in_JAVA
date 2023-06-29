public class first_last_occurence {
    public static void main(String[] args) {
        int arr[] = new int[]{10,20,20,20,20,20,20,20,20,30,40,40,40,40,50,60,60,60,70,80,80,80,80,90,100};
        int search = 20;
        int first_occ = -1;
        int last_occ = -1;
        int low = 0;
        int high = arr.length;

        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] == search){
                first_occ = mid;
                high = mid - 1;
            }
            else if(arr[mid] > search){
                high = mid - 1;
            }

            else if(arr[mid]  < search){
                low = mid + 1;
            }
        }

        System.out.println(first_occ);

        low = 0;
        high = arr.length;

        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] == search){
                last_occ = mid;
                low = mid + 1;
            }
            else if(arr[mid] > search){
                high = mid - 1;
            }

            else if(arr[mid]  < search){
                low = mid + 1;
            }
        }

        System.out.println(last_occ);

        System.out.println("occurences : "+(last_occ - first_occ + 1));
    }
}
