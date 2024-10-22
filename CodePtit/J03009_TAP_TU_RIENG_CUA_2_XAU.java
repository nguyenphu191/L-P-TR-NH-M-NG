
import java.util.HashSet;
import java.util.Scanner;


public class J03009_TAP_TU_RIENG_CUA_2_XAU {
    public static Scanner sc= new Scanner (System.in);
    
    public static void main(String[] args) {
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s1=sc.nextLine();
            String s2=sc.nextLine();
            String a[]=s1.split("\\s+");
            HashSet<String> sett=new HashSet<>();
            for(String i : a){
                if(s2.contains(i)==false){
                    sett.add(i);
                }
            }
            for(String i : sett){
                System.out.printf(i+" ");
            }
            System.out.println("");
        }
    }
}
