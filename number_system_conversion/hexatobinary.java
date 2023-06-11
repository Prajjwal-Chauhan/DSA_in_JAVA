public class hexatobinary {

    private static int decimal(String hexNumber) {
    int decimal = 0;
    String hexCode = "0123456789ABCDEF";
    hexNumber = hexNumber.toUpperCase();
    int length = hexNumber.length();
    if (length > 0) {
        char ch = hexNumber.charAt(0);
        int digit = hexCode.indexOf(ch);
        String substring = hexNumber.substring(1);
        decimal = digit * (int) Math.pow(16, length - 1) + decimal(substring);
    }
    return decimal;
}

public static int binary(int decimal){
        if(decimal == 0) return 0;
        return decimal % 2 + 10*binary(decimal/2);
    }
    public static void main(String[] args) {
        String hexadecimal = "7D";
        // System.out.println(decimal(hexadecimal));
        System.out.println(binary(decimal(hexadecimal)));
    }
}
