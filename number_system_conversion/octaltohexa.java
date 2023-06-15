import java.io.*;
import java.util.*;

class Solution {
   

    private static char a[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
    private static int reminder;
    private static String hexaString = "";

    public int decimal(int oct, int i){
	    if(oct == 0)
	        return 0;

        int digit = oct%10;
	    return (int)Math.pow(8,i)*digit + decimal(oct/10, ++i);
	}
   

    public String convert(int n) {
        // your solutions goes here..
        if(n == 0) return hexaString;

        reminder = n%16;
        hexaString = a[reminder] + hexaString;
        return convert(n/16);
    }
}

public class octaltohexa {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
 
        // Reading N and K
        String str = bufferedReader.readLine().trim();
        int n = Integer.parseInt(str);
        
        Solution solution = new Solution();
        int m = solution.decimal(n,0);
        String result = solution.convert(m);
        System.out.println(result);
    }
}
