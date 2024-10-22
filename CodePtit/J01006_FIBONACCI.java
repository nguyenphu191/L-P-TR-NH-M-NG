
import java.util.Scanner;

public class J01006_FIBONACCI {
    public static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) {
        long[] fb = new long[93];
        fb[0]=0;
        fb[1]=1;
        for(int i=2;i<93;i++){
            fb[i]=fb[i-1]+fb[i-2];
        }
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            System.out.println(fb[n]);
        }
    }
}
