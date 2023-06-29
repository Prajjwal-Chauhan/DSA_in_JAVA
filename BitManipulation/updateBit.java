public class updateBit {
    public static void main(String[] args) {
        int n = 20;
        int k = 4;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(n|1<<(k-1)); 
    }
}
