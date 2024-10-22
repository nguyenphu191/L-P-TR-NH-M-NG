
import java.util.Scanner;

public class J01011_BOI_SO_CHUNG_VA_UOC_SO_CHUNG {
    public static Scanner sc=new Scanner(System.in);
    public static long ucln(long n,long m){
        while(n!=m){
            if(n>m){
                n=n-m;
            }else{
                m=m-n;
            }
        }
        return n;
    }
    public static void main(String[] args) {
        long t=sc.nextInt();
        while(t-->0){
            long a=sc.nextLong();
            long b=sc.nextLong();
            long uc=ucln(a,b);
            long bc=a*b/uc;
            System.out.println(bc+" "+uc+"\n");            
        }
 
    }
}
