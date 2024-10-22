
import java.util.Scanner;

public class J01004_SO_NGUYEN_TTO {
    public static Scanner sc=new Scanner(System.in);
    public static boolean checknt(long n){
        if (n<2){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if (n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            if (checknt(n)){
                System.out.println("YES\n");
            }else{
                System.out.println("NO\n");
            }
        }
    }
}
