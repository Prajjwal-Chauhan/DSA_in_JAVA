public class clearBit {
    public static void main(String[] args) {
        int n = 45;
        int k = 4;
        int mask = ~(1<<(k-1));
        System.out.println(Integer.toBinaryString(n));
        System.out.println(n & mask);
        System.out.println(Integer.toBinaryString(n & mask));

    }
}
