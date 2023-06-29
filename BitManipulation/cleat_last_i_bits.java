public class cleat_last_i_bits {
    public static void main(String[] args) {
        int n = 25;
        int k = 3;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(n&~0<<k);
        System.out.println(Integer.toBinaryString(n&~0<<k));
    }
}
