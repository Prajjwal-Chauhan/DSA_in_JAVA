public class decimaltohexa {
    private static char a[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
    private static int reminder;
    private static String hexaString = "";

    public static String hexadecimal(int i){
        if(i == 0) return hexaString;

        reminder = i%16;
        hexaString = a[reminder] + hexaString;
        return hexadecimal(i/16);
    }
    public static void main(String[] args) {
        int decimal = 1256;
        System.out.println(hexadecimal(decimal));
    }
}
