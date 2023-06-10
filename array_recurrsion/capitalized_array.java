// package array_recurrsion;

/**
 * capitalized_array
 */
public class capitalized_array {

    public static void capitalize(String[] strarr,int i ,int n){
        if(i>=n) return;

        strarr[i] = strarr[i].toUpperCase();

        capitalize(strarr, i+1, n);
    }

    public static void main(String[] args) {
        String strarr[] = {"foo","bar","world"};

        capitalize(strarr, 0, strarr.length);

        for (String string : strarr) {
            System.out.print(string+" ");
        }

    }
}