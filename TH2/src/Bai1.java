
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
class GV{
    private static int stt=0;
    private String ma,name;
    private double hs;
    private String hskk;
    private int hour;

    public GV() {
    }

    public GV( String name, double hs, String hskk, int hour) {
        stt++;
        this.ma = "PM"+String.format("%03d",stt);
        this.name = name;
        this.hs = hs;
        this.hskk = hskk;
        this.hour = hour;
    }

    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHs() {
        return hs;
    }

    public void setHs(double hs) {
        this.hs = hs;
    }

    public String getHskk() {
        return hskk;
    }

    public void setHskk(String hskk) {
        this.hskk = hskk;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
    public double getKk(){
        switch (hskk) {
            case "A":
                return 1.5f;
            case "B":
                return 1.2f;
            default: 
                return 1.0f;
        }
    }
    public int getPhat(){
        if(hour>=500){
            return 100;
        }else if(hour>=351 && hour<=499){
            return 95;
        }else if(hour>=101 && hour<=350){
            return 90;
        }else{
            return 85;
        }
    }
    public double getLuong(){
        return hs*getKk()*3000*getPhat()/100;
    }

    @Override
    public String toString() {
        return ma + " " + name + " " + hs + " " + hskk + " " + hour + " "+String.format("%.0f",getLuong());
    }
    
}
public class Bai1 {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {     
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<GV> list=new ArrayList<>();
        for(int i=1;i<=t;i++){
            GV x;
            String name=sc.nextLine();
            double hs=Double.parseDouble(sc.next());
            sc.nextLine();
            String hskk=sc.next();
            int hour=Integer.parseInt(sc.next());
            sc.nextLine();
            x=new GV(name,hs,hskk,hour);
            list.add(x);
        }
        for(GV a : list){
            System.out.println(a);
        }
    }
}
//2
//To an An
//4.2
//B
//300
//Tran Van Tuan
//3.5
//C
//800