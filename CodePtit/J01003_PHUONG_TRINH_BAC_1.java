
import java.util.Scanner;


public class J01003_PHUONG_TRINH_BAC_1 {
    public static Scanner sc=new Scanner(System.in);
    public static String doi(double n){
        return String.format("%.2f",n);
    }
    public static void main(String[] args) {
        double a =sc.nextDouble();
        double b=sc.nextDouble();
        double kq;
        if(a==0 && b!=0){
            System.out.println("VN");
        }else if(a==0&&b==0){
            System.out.println("VSN");
        }else{
            kq=-b/a;
            System.out.println(doi(kq));
        }
    }
}
