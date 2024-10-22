
import java.util.Scanner;


public class J02013_SAP_XEP_NOI_BOT {
    public static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) {
        int n=sc.nextInt();
        int[] a=new int[n];
        int tmp;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            boolean ck=false;
            for(int j=0;j<n-1;j++){
                if(a[j]>a[j+1]){
                    ck=true;
                    tmp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=tmp;
                }
            }
            if(ck==false) break;
            System.out.printf("Buoc %d: ",i+1);
            for(int j=0;j<n;j++){
                System.out.printf("%d ",a[j]);
            }
            System.out.println();
        }
    }
}
