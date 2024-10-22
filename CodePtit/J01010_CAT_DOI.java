
import java.util.Scanner;


public class J01010_CAT_DOI {
    public static Scanner sc=new Scanner(System.in);
    public static long xuli(String n){
        
        long s=0;
        boolean kt=false;
        for(int i=0;i<n.length();i++){
            char c=n.charAt(i);
            if(c!='1'&&c!='0'&&c!='9'&&c!='8'){
                return 0;
            }
            if(c=='0') s=s*10+0;
            if(c=='1'){
                s=s*10+1;
                kt=true;
            }
            if(c=='8') s=s*10+0;
            if(c=='9') s=s*10+0;
        }
//        String str=new StringBuffer(s).reverse().toString();
//        int kq=Integer.valueOf(str);
        if (kt==false){
            
            return 0;
        }
        return s;
       
    }
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            String n=sc.next();
            if(xuli(n)==0){
                System.out.printf("INVALID\n");
            }else{
                System.out.println(xuli(n));
            }
        }
    }
}
