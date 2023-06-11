public class decimaltooctal {

     public static int octal(int decimal){
        if(decimal == 0) return 0;
        return decimal % 8 + 10*octal(decimal/8);
    }
    public static void main(String[] args) {
        int decimal = 8;
        System.out.println(octal(decimal));
    }
}
