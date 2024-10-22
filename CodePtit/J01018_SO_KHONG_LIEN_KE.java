
import java.util.Scanner;

public class J01018_SO_KHONG_LIEN_KE {
    public static Scanner sc=new Scanner(System.in);
    public static boolean check(long n){
        long sum=0;
        while(n>=10){
            long c=n%10;
            sum+=c;
            n/=10;
            long d=n%10;
            if(Math.abs(c-d)!=2){
                return false;
            }   
        }
        sum+=n;
        if(sum%10!=0){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            if(check(n)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }    
}
