import java.util.Scanner;


public class J02011_SAP_XEP_CHON {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int n=sc.nextInt();
        int[] a=new int[n];
        int tmp;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            System.out.printf("Buoc %d: ",i+1);
            int min=999;
            int k=0;
            for(int j=i;j<n;j++){
                if(a[j]<min){
                    min=a[j];
                    k=j;
                }
            }
            tmp=a[i];
            a[i]=a[k];
            a[k]=tmp;
            for(int j=0;j<n;j++){
                System.out.printf("%d ",a[j]);
            }
            System.out.println();
        }
    }
}
