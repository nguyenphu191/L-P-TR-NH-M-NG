
import java.util.Scanner;

public class J02006_HOP_CUA_2_MANG {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[m];
        int[] dem=new int[1001];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            dem[a[i]]=1;
        }
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
            dem[b[i]]=1;
        }
        for(int i=0;i<1000;i++){
            if (dem[i]==1){
                System.out.printf(i+" ");
            }
        }
    }
}
