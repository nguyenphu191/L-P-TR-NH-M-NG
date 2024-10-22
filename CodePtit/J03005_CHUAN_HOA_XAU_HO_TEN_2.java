
import java.util.Scanner;


public class J03005_CHUAN_HOA_XAU_HO_TEN_2 {
    public static Scanner sc=new Scanner(System.in);
    public static String chuanhoa(String s){
        s=s.toLowerCase();
        return s.substring(0,1).toUpperCase()+s.substring(1);       
    }
    public static void main(String[] args) {
        int t= Integer.parseInt(sc.nextLine());
        while(t-->0){
            String ss=sc.nextLine();
            ss=ss.trim();
            String arr[]=ss.split("\\s+");
            for(int i=1;i<arr.length;i++){
                if(i==arr.length-1){
                    System.out.printf(chuanhoa(arr[i])+", ");
                }else{
                    System.out.printf(chuanhoa(arr[i])+" ");
                }
            }
            System.out.println(arr[0].toUpperCase());
        }
    }
}
