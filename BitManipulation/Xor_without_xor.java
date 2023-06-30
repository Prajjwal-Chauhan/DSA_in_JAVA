public class Xor_without_xor {
    public static void main(String[] args) {
        int a = 15;
        int b = 10;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        System.out.println(a^b);
        System.out.println((a&(~b)) | (b&(~a)));
    }
}
