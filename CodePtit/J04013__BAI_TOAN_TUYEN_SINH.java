
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
class ThiSinh{
    private String ma;
    private String name;
    private double toan,ly,hoa;
    private double ut;

    public ThiSinh() {
    }

    public ThiSinh(String ma, String name, double toan, double ly, double hoa) {
        this.ma = ma;
        this.name = name;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
        switch(ma.substring(0, 3)) {
            case "KV1":
                this.ut=0.5f;
                break;
            case "KV2":
                this.ut=1.f;
                break;
            case "KV3":
                this.ut=2.5f;
                break;
        }
    }
    public double tongdiem(){
        return toan*2+ly+hoa;
    }
    public String tinhtrang(){
        if(tongdiem()+ut>=24.f){
            return "TRUNG TUYEN";
        }
        return "TRUOT";
    }
    public String formatint(double x){
        int tmp=(int)(x*100);
        if(tmp%100==0){
            return String.format("%.0f", x);
        }
        return String.format("%.1f", x);
    }
    @Override
    public String toString() {
        return ma + " " + name + " " +formatint(ut) + " " + formatint(tongdiem()) + " "+tinhtrang();
    }
    
}
public class J04013__BAI_TOAN_TUYEN_SINH {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ma=sc.nextLine();
        String name=sc.nextLine();
        double toan=Double.parseDouble(sc.nextLine());
        double ly=Double.parseDouble(sc.nextLine());
        double hoa=Double.parseDouble(sc.nextLine());
        ThiSinh ts=new ThiSinh(ma,name,toan,ly,hoa);
        System.out.println(ts);
    }
}
//KV2A002
//Hoang Thanh Tuan
//5
//6
//5
