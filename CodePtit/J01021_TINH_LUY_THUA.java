
import java.util.Scanner;
public class J01021_TINH_LUY_THUA {
    public static Scanner sc=new Scanner(System.in);
    public static final int mod=(int) 1e9 + 7;
    public static long pow(long a,long b){
     //   if(a==0) return 0;
        if(b==0) return 1;
        if(b==1) return a%mod;
        long lt=pow(a,b/2)%mod;
        if(b%2==0) return (lt*lt)%mod;
        else return (((lt*lt)%mod)*a)%mod;
    }
    public static void main(String[] args) {
        while(true){
            long a=sc.nextLong();
            long b=sc.nextLong();
            if(a==0&&b==0){
                return;
            }else{
                System.out.println(pow(a,b));
            }
        }
    }
}
