
import java.util.Scanner;
import java.util.Arrays;

public class J01025_HINH_VUONG {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int[] x= new int[4];
        int[] y=new int[4];
        for(int i=0;i<4;i++){
            x[i]=sc.nextInt();
            y[i]=sc.nextInt();
        }
        Arrays.sort(x);
        Arrays.sort(y);
        int canh= Math.max((x[3]-x[0]), (y[3]-y[0]));
        System.out.println(canh*canh);
    }
}
