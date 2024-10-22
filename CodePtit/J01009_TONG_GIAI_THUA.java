
import java.util.Scanner;


public class J01009_TONG_GIAI_THUA {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int n=sc.nextInt();
        long sum=0;
        long k=1;
        for(int i=1;i<=n;i++){
            k=k*i;
            sum+=k;
        }
        System.out.println(sum);
    }
}
