
import java.util.Scanner;


public class J03027_RUT_GON_XAU_KY_TU {
    public static Scanner sc=new Scanner (System.in);
    public static void main(String[] args) {
        String s=sc.next();
        boolean trong=false;
        int j=0;
        while(true){
            if(s.isEmpty()){
                trong=true;
                break;
            }
            if(j==s.length()-1){
                break;
            }
            if(s.charAt(j)==s.charAt(j+1)){
                s=s.substring(0, j)+s.substring(j+2);
               if(j>0) j--; 
            }else{
                j++;
            }
        }
        if(trong){
            System.out.println("Empty String");
        }else{
            System.out.println(s);
        }
    }
            
}
