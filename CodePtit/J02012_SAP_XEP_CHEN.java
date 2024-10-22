
import java.util.Scanner;

public class J02012_SAP_XEP_CHEN {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int n=sc.nextInt();
        int[] a=new int[n+1];
        int tmp;
        int ii;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            ii=i;
            while(ii>0&&a[ii]<a[ii-1]){
                tmp=a[ii];
                a[ii]=a[ii-1];
                a[ii-1]=tmp;
                ii--;
            }
            System.out.printf("Buoc %d: ",i);
            for(int j=0;j<=i;j++){
                System.out.printf("%d ",a[j]);
            }
            System.out.println();
        }
    }
}
