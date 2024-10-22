
import java.util.HashSet;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class J02016_BO_3_SO_PYTAGO {
    public static Scanner sc =new Scanner (System.in);
    public static boolean checkcp(long a){
        long b=(long)Math.sqrt(a);
        float c=(float)Math.sqrt(a);
        if(b-c==0)return true;
        return false;
    }
    public static void main(String[] args) {
        long t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long[] a=new long[n+1];
            HashSet se=new HashSet();
            for(int i=0;i<n;i++){
                a[i]=sc.nextLong();
                se.add(a[i]);
            }
            if(se.size()<3){
                System.out.println("NO");
            }else{
               boolean ck=false;
               long c;
               for(int i=0;i<n-1;i++){
                   for (int j=i+1;j<n;j++){
                       c =(a[i]*a[i]+a[j]*a[j]);
                       if(checkcp(c)){
                           c=(long)Math.sqrt(c);
                           if(se.contains(c)){
                               ck=true;
                               break;
                           }
                       }
                   }
               }
               if(ck) System.out.println("YES");
               else System.out.println("NO");
            }
           
        }
    }
            
}
