import java.util.ArrayList;
import java.util.List;

public class searchelement_storeindex {

    public static void store_index(int arr[],int el,int i,int n,List<Integer>store){
        if(i >= n){
            return;
        }
        store_index(arr,el,i+1,n,store);
        if(arr[i] == el) store.add(i);
    }
    public static void main(String[] args) {
        int arr[] = {20 ,15 ,20, 16, 20, 54, 30,35,20,21,51,98,86,20,26};
        List<Integer> store = new ArrayList<>();
        int element = 20;
        store_index(arr,element,0,arr.length,store);
        System.out.println(store);
    }
}
