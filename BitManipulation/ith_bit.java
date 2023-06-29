public class ith_bit {
    public static void main(String[] args) {
        int n= 20;
        int i = 4;
        System.out.println(Integer.toBinaryString(n));

        System.out.println(((n>>i-1)&1));

    }
}
