
import java.util.Scanner;


public class J02017_THU_GON_DAY_SO {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int dem=0;
        for(int i=0;i<n-1;i++){
            if((a[i]+a[i+1])%2==0&&a[i]!=0&&a[i+1]!=0){
                a[i]=0;
                a[i+1]=0;
            }
        }
        for(int i=0;i<n;i++){
            if (a[i]!=0) dem++;
        }
        System.out.println(dem);
    }
}
