
import java.util.Scanner;

public class J01008_PHAN_TICH_SNT {
    public static Scanner sc= new Scanner(System.in);
    public static void xuli(int k){
        int n=sc.nextInt();
        System.out.printf("Test %d: ",k);
        for(int i=2;i<=Math.sqrt(n);i++){
            int dem=0;
            while(n%i==0){
                dem++;
                n=n/i;
            }
            if(dem!=0){
                System.out.printf("%d(%d) ",i,dem);
            }
        }
        if(n!=1){
            System.out.printf("%d(%d) ",n,1);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int t=sc.nextInt();
        for (int i=1;i<=t;i++){
            xuli(i);
        }
    }
}
