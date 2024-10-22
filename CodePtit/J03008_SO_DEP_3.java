import java.util.Scanner;

public class J03008_SO_DEP_3 {
    public static Scanner sc=new Scanner(System.in);
    public static boolean checknt(int n){
        if(n<2) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
    public static boolean check(String s){
        for(int i=0;i<s.length()/2;i++){
            int a=s.charAt(i)-'0';
            if(checknt(a)==false) return false;
            int b=s.charAt(s.length()-1-i)-'0';
            if (a!=b)return false;
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
