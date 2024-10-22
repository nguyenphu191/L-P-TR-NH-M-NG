
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class J02023_LUA_CHON_THAM_LAM {
    public static Scanner sc=new Scanner(System.in);
    public static void swap(int a,int b){
        int tmp=a;
        a=b;
        b=tmp;
    }
    public static void main(String[] args) {
        int n=sc.nextInt();
        int s=sc.nextInt();
        int ss;
        int[] minn=new int[n];
        int[] maxx=new int[n];
        int tmp;
        ss=s;
        for(int i=0;i<n;i++){
            tmp=Math.min(ss, 9);
            minn[i]=tmp;
            ss-=tmp;
        }
        boolean ck=false;
        if(minn[n-1]==0){
            
            for(int i=n-2;i>=0;i--){
                if(minn[i]!=0){
                    ck=true;
                    minn[i]--;
                    minn[n-1]++;
                    break;
                }
            }
        }else{
            ck=true;
        }       
        if(ss>0||ck==false){
            System.out.println("-1 -1");
        }else{
            ss=s;
            for(int i=0;i<n;i++){
                tmp=Math.min(ss, 9);
                maxx[i]=tmp;
                ss-=tmp;
            }
            for(int i=n-1;i>=0;i--){
                System.out.print(minn[i]);
            }
            System.out.printf(" ");
            for(int i=0;i<n;i++){
                System.out.print(maxx[i]);
            }
            System.out.println();
        }
    }
}
