
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class J07003_TACH_DOI_VA_TINH_TONG {
    public static String cong(String s,String r){
        while(s.length()>r.length()){
            r="0"+r;
        }
        while(r.length()>s.length()){
            s="0"+s;
        }
        int nho=0;
        String res="";
        int a;
        for(int i=s.length()-1;i>=0;i--){
            a=(s.charAt(i)-'0'+r.charAt(i)-'0'+nho)%10;
            nho=(s.charAt(i)-'0'+r.charAt(i)-'0'+nho)/10;
            res=a+res;
        }
        if(nho!=0){
            res=nho+res;
        }
        return res;
    }
    public static void main(String[] args) throws FileNotFoundException{
        File f=new File("DATA.in");
        Scanner sc=new Scanner(f);
        String a;
        String b;
        if(sc.hasNext()){
            String w=sc.next();
            while(w.length()>1){
                a=w.substring(0,w.length()/2);
                b=w.substring(w.length()/2);
                w=cong(a,b);
                //System.out.println(a);
                System.out.println(w);
            }

        }
    }
}
