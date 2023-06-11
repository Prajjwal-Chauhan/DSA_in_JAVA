public class divide_power_sum {

    private static double sum = 0;

    public static int pow(int b,int e){
        if(e == 1){
            return b;
        }
        
        return b * pow(b,e-1);
    } 

    public static void dps1(int n){
        if(n < 1) return;

        sum += (n*1.0)/(pow(n,n));
        dps1(n-1);
    }

    public static double dps2(int n){
        if(n == 1) return (n*1.0)/(pow(n,n));

        return (n*1.0)/pow(n,n) + dps2(n-1);
    }
    public static void main(String[] args) {
        // stack build
        dps1(5);
        System.out.println(sum);

        // stack fall
        System.out.println(dps2(5));
        
    }
}
