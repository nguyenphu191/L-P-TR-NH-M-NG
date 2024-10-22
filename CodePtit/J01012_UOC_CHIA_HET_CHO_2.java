
import java.util.Scanner;

public class J01012_UOC_CHIA_HET_CHO_2 {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            int dem=0;
            for(long i=1;i<=Math.sqrt(n);i++){
                if(n%i==0&&i%2==0){
                    dem++;
                }
                if(n%i==0&&(n/i)%2==0&&i!=Math.sqrt(n)){
                    dem++;
                }
            }
            System.out.println(dem+"\n");        
        }
        
    }
}
