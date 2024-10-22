
import java.util.Scanner;


public class J02034_BO_SUNG_DAY_SO {
    public static Scanner sc=new Scanner(System.in);   
    public static void main(String[] args) {
        int n=sc.nextInt();
        int[] a=new int[n+1];
        int Max=0;
        int[] ck=new int[10005];
        for(int i=1;i<=n;i++){
            a[i]=sc.nextInt();
            ck[a[i]]=1;
            Max=Math.max(Max,a[i]);            
        }
        boolean k=true;
        for(int i=1;i<=Max;i++){
            if(ck[i]==0){
                System.out.println(i);
                k=false;
            }
        }
        if (k){
            System.out.println("Excellent!");
        }
    }
}
