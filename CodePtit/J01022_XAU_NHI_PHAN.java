
//import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;

public class J01022_XAU_NHI_PHAN {
    public static Scanner sc=new Scanner (System.in);
    public static String chiadetri(int n,long k,long x[]){
        if(n==1) return "0";
        if(n==2) return "1";
        if(k<=x[n-2]){
            return chiadetri(n-2,k,x);
        }else{
            return chiadetri(n-1,k-x[n-2],x);
        }
    }      
    
    public static void main(String[] args) {
        long[] x=new long[100];
        x[1]=x[2]=1;
        for(int i=3;i<100;i++){
            x[i]=x[i-1]+x[i-2];
        }
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long k=sc.nextLong();
            System.out.println(chiadetri(n,k,x));
        }
    }
    
}
