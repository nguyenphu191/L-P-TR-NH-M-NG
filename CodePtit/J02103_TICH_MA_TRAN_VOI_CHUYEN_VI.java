
import java.util.Scanner;

public class J02103_TICH_MA_TRAN_VOI_CHUYEN_VI {
    public static Scanner  sc=new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        for(int x=1;x<=t;x++){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[][] a=new int[n][m];
            int[][] b=new int[m][n];
            int[][] c=new int[n][n];
            for (int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    a[i][j]=sc.nextInt();
                    b[j][i]=a[i][j];
                }
            }
            for(int i=0;i<n;i++){
                for(int k=0;k<n;k++){
                    c[i][k]=0;
                    for(int j=0;j<m;j++){
                        c[i][k]+=a[i][j]*b[j][k];
                    }
                }
            }
            System.out.printf("Test %d:\n",x);
            for(int i=0;i<n;i++){
                for(int k=0;k<n;k++){
                    System.out.printf("%d ",c[i][k]);
                }
                System.out.println("");
            }
        }
    }
}
