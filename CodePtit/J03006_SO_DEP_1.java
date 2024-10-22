
import java.util.Scanner;


public class J03006_SO_DEP_1 {
    public static Scanner sc=new Scanner(System.in);
    public static boolean check(String s){
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            char b=s.charAt(s.length()-1-i);
            if (a!=b)return false;
            if (a=='1'||a=='3'||a=='5'||a=='7'||a=='9') return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s=sc.next();
            if (check(s)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
