
import java.util.Scanner;


public class J03032_DAO_TU {
    public static Scanner sc=new Scanner(System.in);
    public static String dao(String s){
        String res="";
        for(int i=s.length()-1;i>=0;i--){
            res+=s.charAt(i);
        }
        return res;
    }
    public static void main(String[] args) {
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s=sc.nextLine();
            String a[]=s.split("\\s+");
            for(String i : a){
                i=dao(i);
                System.out.printf(i+" ");
            }
            System.out.println("");
        }
    }
}
