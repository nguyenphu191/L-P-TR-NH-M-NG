
import java.util.Scanner;


public class J01013_TONG_UOC_SO_1 {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        long kq =0;
        while(t-->0){
            long sum = 0;
            int n=sc.nextInt();
            for(int i=2;i<=Math.sqrt(n);i++){
                int dem=0;
                while(n%i==0){
         //           System.out.printf(i+" ");
                    dem++;
                    n/=i;
                } 
                if(dem>0) sum=sum+i*dem;
            }
            if(n>1) sum+=n;
//            System.out.println(sum);
            kq+=sum;
        }
        System.out.println(kq);
    }
}
