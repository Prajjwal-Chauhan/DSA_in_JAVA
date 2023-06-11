public class count_zero {
    static void count1(int num,int c){
        if(num <= 0) {
            System.out.println(c);
            return;
        }

        int r = num%10;
        if(r == 0) c++;
        num /= 10;
        count1(num,c);
    }

    static int count2(int num,int c){
        if(num <= 0)
            return c;

        int r = num%10;
        if(r == 0) c++;
        num /= 10;
        return count2(num,c);
    }
    public static void main(String[] args) {
        // void type
        int num = 102030;
        count1(num,0);

        // return type
        System.out.println(count2(num,0));
    }
}
