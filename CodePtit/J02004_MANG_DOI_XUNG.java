
import java.util.Scanner;

public class J02004_MANG_DOI_XUNG {
    public static Scanner sc=new Scanner(System.in);
    public static void xuli(){
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<=n/2;i++){
            if (a[i]!=a[n-1-i]){
                System.out.println("NO");
                return;
            }
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
