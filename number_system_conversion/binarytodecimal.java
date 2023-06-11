public class binarytodecimal {

    public static int decimal(String binary,int i){
        int n = binary.length();
        if(i == n-1) return binary.charAt(i)-'0';
        return (binary.charAt(i) - '0' << (n-i-1)) + decimal(binary, i+1);
    }
    public static void main(String[] args) {
        String binary = "1010";
        System.out.println(decimal(binary,0));
    }
}
