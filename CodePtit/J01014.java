
import java.util.Scanner;


public class J01014 {
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
    public static void xuli(){
        long n=sc.nextLong();
        if(checknt(n)){
            System.out.println(n);
            return;
        }
        long max=0;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                if(checknt(n/i)){
                    System.out.println(n/i);
                    return;
                }
                if(checknt(i)){
                    max=Math.max(max, i);
                }
                
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            xuli();
        }
    }
}
