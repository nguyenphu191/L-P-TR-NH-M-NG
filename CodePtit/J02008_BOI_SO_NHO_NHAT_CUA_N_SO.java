
import java.util.Scanner;


public class J02008_BOI_SO_NHO_NHAT_CUA_N_SO {
    public static Scanner sc=new Scanner(System.in);
    public static long gcd(long a,long b){
        while(b!=0){
            long x=a%b;
            a=b;
            b=x;
        }
        return a;
    }
    public static long lcm(long a,long b){
        return a*b/gcd(a,b);
    }
    public static void main(String[] args) {
        int t=sc.nextInt(); 
        while(t-->0){
            long ans=1;
            long n=sc.nextInt();
            for(long i=2;i<=n;i++){
                ans=lcm(ans,i);
            }
            System.out.println(ans);
        }
    }
}
