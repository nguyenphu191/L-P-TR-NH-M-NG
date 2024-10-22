
import java.util.Arrays;
import java.util.Scanner;

public class J02005_GIAO_CUA_2_DAY_SO {
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
        }
        Arrays.sort(b);
        for(int i=0;i<m;i++){
            if (dem[b[i]]==1){
                System.out.printf(b[i]+" ");
                dem[b[i]]=0;
            }
        }
    }
    

}
