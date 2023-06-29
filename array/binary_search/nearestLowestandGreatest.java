public class nearestLowestandGreatest {
    public static void main(String[] args) {
        int arr[] = new int[]{10,20,30,40,50,60,70,80,90,100};
        int low = 0;
        int high = arr.length - 1;

        int searchElem = 72;
        int i = 0;
        int nearestLowest = 0;
        int nearestGreatest = 0;

        while(i < arr.length){
            int mid = (low+high)/2;
            if(searchElem > arr[mid]){
                nearestLowest = arr[mid];
                low = mid + 1;
            }

            else if(searchElem < arr[mid]){
                nearestGreatest = arr[mid];
                high = mid - 1;
            }

            else if(arr[mid] == searchElem){
                nearestGreatest = nearestLowest = arr[mid];
                return;
            }
            i++;
        }

        System.out.println(nearestLowest);
        System.out.println(nearestGreatest);

    }
}
