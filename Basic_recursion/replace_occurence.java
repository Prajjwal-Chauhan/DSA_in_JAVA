public class replace_occurence {

    public static void replace_occurences(int arr[],int el,int i,int n,int target){
        if(i >= n){
            return;
        }
        replace_occurences(arr,el,i+1,n,target);
        if(arr[i] == el) arr[i] = target;
    }
    public static void main(String[] args) {
        int arr[] = {20 ,15 ,20, 16, 20, 54, 30,35,20,21,51,98,86,20,26};
        int element = 20;
        int target = 9;
        replace_occurences(arr,element,0,arr.length,target);

        for(int i : arr){
            System.out.print(i +" ");
        }
        
    }
}
