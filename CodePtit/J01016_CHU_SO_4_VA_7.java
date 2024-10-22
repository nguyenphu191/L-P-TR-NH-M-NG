
import java.util.Scanner;


public class J01016_CHU_SO_4_VA_7 {
    public static Scanner sc=new Scanner (System.in);
    public static void main(String[] args) {
        long n=sc.nextLong();
        int dem=0;
        while(n>0){
            long c = n%10;
            n/=10;
            if(c==4||c==7){
                dem++;
            }
        }
        if(dem==4||dem==7) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
