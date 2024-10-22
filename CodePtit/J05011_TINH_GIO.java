
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
class Kh{
    private String ma,name,den,di;
    int time;
    public Kh() {
    }

    public Kh(String ma, String name, String den, String di) {
        this.ma = ma;
        this.name = name;
        this.den = den;
        this.di = di;
        int g1=(this.den.charAt(0)-'0')*10+(this.den.charAt(1)-'0');
        int g2=(this.di.charAt(0)-'0')*10+(this.di.charAt(1)-'0');
        int t1=(this.den.charAt(3)-'0')*10+(this.den.charAt(4)-'0');
        int t2=(this.di.charAt(3)-'0')*10+(this.di.charAt(4)-'0');
        this.time=(g2-g1)*60+t2-t1;
    }
    private int getPhut(){
        return this.time%60;
    }
    private int getGio(){
        return this.time/60;
    }
    @Override
    public String toString() {
        return ma + " " + name + " " + getGio() + " gio " + getPhut() + " phut ";
    }
    
}
public class J05011_TINH_GIO {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Kh> list=new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String ma=sc.nextLine();
            String name=sc.nextLine();
            String den=sc.nextLine();
            String di=sc.nextLine();
            Kh kh=new Kh(ma,name,den,di);
            list.add(kh);
        }
        Collections.sort(list,new Comparator<Kh>(){
            @Override
            public int compare(Kh a, Kh b){
                if(a.time<b.time){
                    return 1;
                }else{
                    return -1;
                }
            }
        });
        for(Kh x:list){
            System.out.println(x);
        }
    }
}
//3
//01T
//Nguyen Van An
//09:00
//10:30
//06T
//Hoang Van Nam
//15:30
//18:00
//02I
//Tran Hoa Binh
//09:05
//10:00