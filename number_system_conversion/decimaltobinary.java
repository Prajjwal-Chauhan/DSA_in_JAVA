/**
 * decimaltobinary
 */
public class decimaltobinary {

    public static int binary(int decimal){
        if(decimal == 0) return 0;
        return decimal % 2 + 10*binary(decimal/2);
    }

    public static void main(String[] args) {
        int decimal = 10;
        System.out.println(binary(decimal));
    }
}