import java.io.*;
import java.util.*;

class Solution {
    private static ArrayList<Integer> arr = new ArrayList<>();
    // private static ArrayList<Integer> numbers = new ArrayList<>();
    // private static String s2 = "";

    private static int sum = 0;
    private static int idx = 0;

    // public static int isPerfect(int num) {
    //     if(num < 1) return sum;
    //     sum += num%10;
    //     if(num%10 == 0) numbers.add(num);
    //     else{
    //         numbers.add(num%10);
    //     }
    //     num /= 10;
    //     return isPerfect(num);
    // }

    public static void findDivisors(int n,int i)
	    {
            if(i>=n) return;
	        if (n%i == 0)
	            sum += i;

            findDivisors(n, i+1);
	    }

    public ArrayList<Integer> perfect(int n) {
        // your solutions goes here..
        idx++;
        if (idx > n)
            return arr;
        findDivisors(idx, 1);
        if (sum == idx) {
            arr.add(idx);
        }
        sum = 0;

        return perfect(n);
    }
}

public class perfectnumber {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // Reading N and K
        String str = bufferedReader.readLine().trim();
        int n = Integer.parseInt(str);

        Solution solution = new Solution();
        // System.out.println(solution.isPerfect(n));
        ArrayList<Integer> result = solution.perfect(n);
        System.out.println(result);
    }
}