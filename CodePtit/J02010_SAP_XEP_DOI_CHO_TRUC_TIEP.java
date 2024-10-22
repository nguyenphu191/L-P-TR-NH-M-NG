
import java.util.Scanner;


public class J02010_SAP_XEP_DOI_CHO_TRUC_TIEP {
    public static Scanner sc=new Scanner(System.in);
//    public static void swap(int a,int b){
//        int tmp=a;
//        a=b;
//        b=tmp;
//    }
    public static void main(String[] args) {
        int n=sc.nextInt();
        int[] a=new int[n];
        int tmp;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            System.out.printf("Buoc %d: ",i+1);
            for(int j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    tmp=a[i];
                    a[i]=a[j];
                    a[j]=tmp;
                }
            }
            for(int j=0;j<n;j++){
                System.out.printf("%d ",a[j]);
            }
            System.out.println();
        }
    }
}
