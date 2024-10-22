
import java.util.Scanner;

public class J01005_CHIA_TAM_GIAC {
    public static Scanner sc=new Scanner(System.in);
    public static void xuli(){
        int sl=sc.nextInt();
        int h=sc.nextInt();
        double h1;
        for(double i=1d;i<sl;i++){
            h1=Math.sqrt(i/sl)*h;
            System.out.printf("%.6f ",h1);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            xuli();
        }
    }
}
