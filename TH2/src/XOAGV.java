/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

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

    public String getMa() {
        return ma;
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
        if(hskk.equals("A")){
            return 1.5f;
        }else if(hskk.equals("B")){
            return 1.2f;
        }else{
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
public class XOAGV {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.next());
        ArrayList<GV> list=new ArrayList<>();
        sc.nextLine();
        for(int i=1;i<=t;i++){
            String name=sc.nextLine();
            double hs=Double.parseDouble(sc.nextLine());
            String hskk=sc.next();
            int hour=Integer.parseInt(sc.next());
            GV x=new GV(name,hs,hskk,hour);
            list.add(x);
        }
        Collections.sort(list, new Comparator<GV>(){
            @Override
            public int compare(GV a,GV b){
                if(a.getName().b.getName()){
                    return 1;
                }
                return 0;
            }
        });
//        String maxoa=sc.nextLine();
//        boolean check=false;
//        for(GV x: list){
//            if(x.getMa().equals(maxoa)){
//                list.remove(x);
//                check=true;
//            }
//        }
//        if(check){
//            System.out.println("xoa thanh cong!");
//                    
//        }else{
//            System.out.println("khong tim thay");
//        }
    }
}
//3
//To thi Van
//4.2
//B
//300
//Vu thi Ha
//3
//B
//700
//Tran Van Ha
//3.5
//C
//800