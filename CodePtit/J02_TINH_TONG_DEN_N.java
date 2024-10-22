
import java.util.Scanner;

public class J02_TINH_TONG_DEN_N {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long t=sc.nextLong();
        while (t-->0){
            long n=sc.nextLong();
            long tong=n*(n+1)/2;
            System.out.println(tong+"\n");
        }
        
    }
}
