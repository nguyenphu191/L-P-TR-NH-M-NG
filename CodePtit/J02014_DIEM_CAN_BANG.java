
import java.util.Scanner;

public class J02014_DIEM_CAN_BANG {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            int su =0;
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                su+=a[i];
            }
            int vt=0;
            int sum=0;
            for(int i=0;i<n;i++){   
                if(su-sum-a[i]==sum){
                    vt=i;
                    break;
                }
                sum+=a[i];
            }
            if(vt!=0){
                System.out.println(vt+1);
            }else{
                System.out.println("-1");
            }
        }
    }

}
