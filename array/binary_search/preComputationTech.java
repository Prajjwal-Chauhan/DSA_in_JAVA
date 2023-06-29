public class preComputationTech {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        System.out.println("Original array");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println("\nPrefix sum array");
        System.out.print(arr[0]+" ");
        for(int i = 1 ; i < arr.length ; i++){
            arr[i] = arr[i] + arr[i-1];
            System.out.print(arr[i]+" ");
        }
    }
}
