
import java.util.Scanner;


public class J02106_MA_TRAN_NHI_PHAN {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int n=sc.nextInt();
        int[][] a=new int[n][3];
        int dem=0;
        int sum;
        for (int i=0;i<n;i++){
            sum=0;
            for(int j=0;j<3;j++){
                a[i][j]=sc.nextInt();
                if(a[i][j]==1) sum++;
            }
            if (sum>1) dem++;
        }
        System.out.println(dem);
    }
}
