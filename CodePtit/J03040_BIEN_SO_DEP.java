
import java.util.Scanner;


public class J03040_BIEN_SO_DEP {
    public static Scanner sc=new Scanner(System.in);
    public static boolean check(String s){
        if(s.charAt(5)==s.charAt(6)&&s.charAt(6)==s.charAt(7)&&s.charAt(9)==s.charAt(10)){
            return true;
        }
        if(s.charAt(5)<s.charAt(6)&&s.charAt(6)<s.charAt(7)&&s.charAt(7)<s.charAt(9)&&s.charAt(9)<s.charAt(10)){
            return true; 
        }
        return false;
    }
    public static boolean check2(String s){
        for (int i=5;i<=7;i++){
            if(s.charAt(i)!='6'&&s.charAt(i)!='8'){
                return false;
            }
        }
        for (int i=9;i<=10;i++){
            if(s.charAt(i)!='6'&&s.charAt(i)!='8'){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            if(check(s)||check2(s)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            
        }
    }
}
