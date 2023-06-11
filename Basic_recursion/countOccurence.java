public class countOccurence {
    public static int count = 0;

    public static void count_occurence(int arr[],int el,int i,int n){
        if(i >= n){
            return;
        }
        count_occurence(arr,el,i+1,n);
        if(arr[i] == el) count++;
    }
    public static void main(String[] args) {
        int arr[] = {20 ,15 ,20, 16, 20, 54, 30,35,20,21,51,98,86,20,26};
        int element = 20;
        count_occurence(arr,element,0,arr.length);
        System.out.println(count);
    }
}
