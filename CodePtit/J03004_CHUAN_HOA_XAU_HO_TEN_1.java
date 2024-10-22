
import java.util.Scanner;


public class J03004_CHUAN_HOA_XAU_HO_TEN_1 {
    public static Scanner sc=new Scanner(System.in);
    public static String chuanhoa(String s){
        s=s.toLowerCase();
        return s.substring(0,1).toUpperCase()+s.substring(1);
    }

    public static void main(String[] args) {
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String ss=sc.nextLine();
            ss=ss.trim();
            String a[]=ss.split("\\s+");
            for (String a1 : a) {
                System.out.printf(chuanhoa(a1) + " ");
            }
            System.out.println("");
        }
    }
}
