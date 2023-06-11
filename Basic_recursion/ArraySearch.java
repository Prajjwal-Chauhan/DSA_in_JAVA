public class ArraySearch {
    static boolean check = false;
    public static void searchelement(int arr[],int el,int i,int n){
        if(i >= n){
            return;
        }
        searchelement(arr,el,i+1,n);
        if(arr[i] == el) check = true;

    } 
    public static void main(String[] args) {
        int arr[] = {20 ,15 ,10, 16, 98, 54, 30};
        int search = 16;
        searchelement(arr,search,0,arr.length);
        System.out.println(check);
    }
}
