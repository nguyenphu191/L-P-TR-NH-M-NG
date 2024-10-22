
import java.util.Scanner;

public class J01007_KIEM_TRA_FABO {
    public static Scanner sc=new Scanner(System.in);
    public static boolean checkfibo(long n){
        if(n==0||n==1) return true;
        else{
            long f1=0,f2=1;
            long fn=f1+f2;
            while(fn<n){
                fn=f1+f2;
                f1=f2;
                f2=fn;
            }
            if (fn==n){
                return true;
            }
            else{
                return false;
            }
        }
    }
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            if(checkfibo(n)){
                System.out.println("YES\n");
            }else{
                System.out.println("NO");
            }
        }
    }
}
