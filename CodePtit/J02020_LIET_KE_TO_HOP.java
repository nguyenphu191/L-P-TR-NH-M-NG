
import java.util.Scanner;


public class J02020_LIET_KE_TO_HOP {
    public static Scanner sc=new Scanner(System.in);
    public static int n,m;
    public static int dem=0;
    public static int[] a=new int[1000];
    public static void in(){
        for(int j=1;j<=m;j++){
            System.out.printf("%d ",a[j]);
        }
        System.out.println();
    }
    public static void Try(int i){
        a[0]=0;
        for(int j=a[i-1]+1;j<=n-m+i;j++){
            a[i]=j;
            if(i==m){
                in();
                dem++;
            }else{
                Try(i+1);
            }
        }
    }
    public static void main(String[] args) {
        n=sc.nextInt();
        m=sc.nextInt();
        Try(1);
        System.out.printf("Tong cong co %d to hop",dem);
    }
            
}
