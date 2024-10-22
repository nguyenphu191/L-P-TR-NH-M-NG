
import java.util.Scanner;


public class J01024_SO_TAM_PHAN {
    public static Scanner sc= new Scanner(System.in);
    public static void xuli(){
        int n=sc.nextInt();
        while(n>0){
            int c=n%10;
            if(c!=0&&c!=1&&c!=2){
                System.out.println("NO");
                return;
            }
            n/=10;
        }
        System.out.println("YES");
    }
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            xuli();
        }
    }
}
