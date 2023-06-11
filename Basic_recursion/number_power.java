public class number_power {

    // **bug** 
    // stack build approach
    private static int pow = 1;
    public static void power1(int b,int e){
        if(e < 1){
            // System.out.println(b);
            return;
        }
        pow*= b;
        power1(b,e-1);
    }

    public static int power2(int b,int e){
        if(e < 1){
            return 1;
        }
        
        pow *= power2(b,e-1);
        pow *= b;

        return pow;
    }
    public static void main(String[] args) {
        // stack build
        power1(2,7);
        System.out.println(pow);
        pow = 1;

        // Stack fall
        System.out.println(power2(2,7));

    }
}
