
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
class Diem{
    private String name,ma;
    public static int stt=0;
    private double tb;
    public Diem() {
    }

    public Diem(String name, double[] a) {
        stt++;
        this.ma="HS"+String.format("%02d", stt);
        this.name = name;
        this.tb=0f;
        this.tb=this.tb+a[0]*2+a[1]*2;
        for(int i=2;i<10;i++){
            this.tb+=a[i];
        }
        this.tb/=12f;
    }

    public double getTb() {
        return tb;
    }
    
    public String getXH(){
        if(this.tb<5f) return "YEU";
        else if(this.tb<7f ) return "TB";
        else if(this.tb<8f) return "KHA";
        else if (this.tb<9f) return "KHA";
        else return "XUAT XAC";
    }

    @Override
    public String toString() {
        return ma+" "+name+" "+String.format("%.1f", tb) +" "+getXH();
    }
    
}
public class J05018_BANG_DIEM_HOC_SINH {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<Diem> list=new ArrayList<>();
//        sc.nextLine();;
        while(t-->0){
            String name=sc.nextLine();
            double a[]=new double[10];
            for(int i=0;i<10;i++){
                a[i]=Double.parseDouble(sc.nextLine());
            }
            Diem d=new Diem(name,a);
            list.add(d);
        }
        Collections.sort(list,new Comparator<Diem>(){
            @Override
            public int compare(Diem a, Diem b){
                if(a.getTb()<b.getTb()){
                    return 1;
                }else{
                    return -1;
                }
                
            }
        });
        for (Diem x: list){
            System.out.println(x);
        }
    }
}
//3
//Luu Thuy Nhi
//9.3  9.0  7.1  6.5  6.2  6.0  8.2  6.7  4.8  5.5
//Le Van Tam
//8.0  8.0  5.5  9.0  6.8  9.0  7.2  8.3  7.2  6.8
//Nguyen Thai Binh
//9.0  6.4  6.0  7.5  6.7  5.5  5.0  6.0  6.0  6.0