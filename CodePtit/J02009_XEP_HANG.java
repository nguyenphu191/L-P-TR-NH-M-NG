
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
class KH{
    private int den;
    private int time;

    public KH() {
    }

    public KH(int den, int time) {
        this.den = den;
        this.time = time;
    }

    public int getDen() {
        return den;
    }
    public int getTime() {
        return time;
    }
    
}
public class J02009_XEP_HANG {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        
        ArrayList<KH> ds=new ArrayList<KH>();
        while(t-->0){
            int den=sc.nextInt();
            int time=sc.nextInt();
            KH a=new KH(den,time);
            ds.add(a);
        }
        Collections.sort(ds, new Comparator<KH>(){
            @Override
            public int compare(KH a,KH b){
                if(a.getDen()>b.getDen()) {
                    return 1;
                }else if(a.getDen()==b.getDen()){
                    return 0;
                }else{
                    return -1;
                }
            }
        });
        int tongtime=0;
        for(KH x: ds){
            if(tongtime<=x.getDen()){
                tongtime=x.getDen()+x.getTime();
            }else{
                tongtime=tongtime+x.getTime();
            }
        }
        System.out.println(tongtime);
    }
}
