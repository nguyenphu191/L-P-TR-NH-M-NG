
import java.util.Scanner;


public class J02022_SO_XA_CACH {
    public static Scanner sc=new Scanner(System.in);
    public static int n;
    public static int[] a;
    public static boolean[] used;
    public static void solve(){
        for(int i=1;i<n;i++){
            if(Math.abs(a[i]-a[i+1])==1){
                return;
            }
        }
        for(int i=1;i<=n;i++){
            System.out.printf("%d",a[i]);
        }
        System.out.println();
    }
    public static void Try(int i){
        for(int j=1;j<=n;j++){
            if(used[j]==false){
                a[i]=j;
                used[j]=true;
                if(i==n){
                    solve();
                }else{
                    Try(i+1);
                }
                used[j]=false;
            }
        }
    }
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            a=new int[100];
            used=new boolean[100];
//            for(int i=1;i<=100;i++){
//                used[i]=false;
//            }
            n=sc.nextInt();
            Try(1);
        }
    }
}
