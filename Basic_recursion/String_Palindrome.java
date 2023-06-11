import java.util.*;
public class String_Palindrome {

    public static boolean checkPalindrome(String str, int s, int e) 
    { 
        if (s == e) return true;  
        if ((str.charAt(s)) != (str.charAt(e))) return false;   
        if (s < e + 1)  return checkPalindrome(str, s + 1, e - 1);   
        return true; 
    }   

    public static boolean isPalindrome(String str) 
    { 
        int n = str.length();   
        if (n == 0) 
            return true;   
        return checkPalindrome(str, 0, n - 1); 
    }   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = sc.nextLine(); 
        System.out.println(isPalindrome(str)); 
        sc.close();
    }
}
