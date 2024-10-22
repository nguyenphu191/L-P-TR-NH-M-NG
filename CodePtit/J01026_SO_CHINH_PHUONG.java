
import java.util.Scanner;


public class J01026_SO_CHINH_PHUONG {
    public static Scanner sc=new Scanner(System.in);
    public static void xuli(){
        int n=sc.nextInt();
        int a=(int)Math.sqrt(n);
        if(a*a==n){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            xuli();
        }
    }
}
