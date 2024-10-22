
import java.math.BigInteger;
import java.util.Scanner;


public class J03013_HIEU_SO_NGUYEN_LON {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String a=sc.next();
            String b=sc.next();
            BigInteger aa=new BigInteger(a);
            BigInteger bb=new BigInteger(b);
            BigInteger cc=new BigInteger(aa.subtract(bb).abs());
            cc.
        }
    }
}
