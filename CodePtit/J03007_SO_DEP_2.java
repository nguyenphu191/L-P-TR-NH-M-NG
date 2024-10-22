
import java.util.Scanner;

public class J03007_SO_DEP_2 {
    public static Scanner sc=new Scanner(System.in);
    public static boolean check(String s){
        int sum=0;
        if(s.charAt(0)!='8') return false;
        for(int i=0;i<s.length()/2;i++){
            char a=s.charAt(i);
            char b=s.charAt(s.length()-1-i);
            if (a!=b)return false;
        }
        for(int i=0;i<s.length();i++){
            sum+=s.charAt(i)-'0';
        }
        if(sum%10!=0) return false;
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
