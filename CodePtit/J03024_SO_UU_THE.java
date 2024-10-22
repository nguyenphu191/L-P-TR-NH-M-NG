
import java.util.Scanner;


public class J03024_SO_UU_THE {
    public static Scanner sc=new Scanner(System.in);
    public static int check(String s){
        int cntle=0;
        int cntch=0;
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)-'0')>=0&&(s.charAt(i)-'0')<=9){
                if((s.charAt(i)-'0')%2==0) cntch++;
                else cntle++;
            }else{
                return 0;
            }
        }
        if(cntch>cntle&&s.length()%2==0) return 1;
        if(cntle>cntch&&s.length()%2==1) return 1;
        return 2;
    }
    public static void main(String[] args) {
        int t=Integer.parseInt(sc.next());
        while(t-->0){
            String s=sc.next();
            if(check(s)==0){
                System.out.println("INVALID");
            }else if(check(s)==1){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
