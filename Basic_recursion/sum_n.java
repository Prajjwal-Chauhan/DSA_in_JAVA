public class sum_n {

    private static int sum = 0;
    public static void sum1(int n){
        if(n < 1){
            return;
        }
        sum += n;
        sum1(n-1);
    }

    public static int sum2(int n){
        if(n==1) return n;

        return n + sum2(n-1);
    }
    public static void main(String[] args) {
        // stack build
        int n = 4;
        sum1(n);
        System.out.println(sum);

        // stack fall
        System.out.println(sum2(n));
    }
}
