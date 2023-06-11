import java.util.Scanner;
public class armstrong {
    public static int sum=0;
	public static boolean check_ArmstrongNumber(int num, int original)
	{
		
		 if(num!=0)
		 {
			 sum+=Math.pow(num%10,3);
			 check_ArmstrongNumber(num/10,original);
		 }
		return sum==original?true:false;
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(check_ArmstrongNumber(num, num));
        sc.close();;
    }
}
