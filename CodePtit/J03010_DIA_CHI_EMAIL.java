
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class J03010_DIA_CHI_EMAIL {
    public static Scanner sc=new Scanner(System.in);
    public static String chuanhoa(String s){
        s=s.toLowerCase();
        char a[]=s.toCharArray();
        return ""+a[0];
    }
    public static void main(String[] args) {
        int t= Integer.parseInt(sc.nextLine());
        ArrayList<String> list=new ArrayList<String>();
        while(t-->0){
            String s=sc.nextLine().trim();
            String a[]=s.split("\\s+");
            String res="";
            String ten=a[a.length-1];
            res+=ten.toLowerCase();
            for(int i=0;i<a.length-1;i++){
                res+=chuanhoa(a[i]);
            }
            list.add(res);
            int cnt= Collections.frequency(list, res);
            if (cnt>1){
                res=res+cnt;
            }
            System.out.println(res+"@ptit.edu.vn");
        }
    }
}
