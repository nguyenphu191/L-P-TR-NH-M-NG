
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
class ThiSinh{
    private String name,date;
    private double d1,d2,d3;
    private int ma;
    public static int stt=0;
    public ThiSinh() {
    }

    public ThiSinh(String name, String date, double d1, double d2, double d3) {
        stt++;
        this.ma=stt;
        this.name = name;
        this.date = date;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }
    public double getTong(){
        return d1+d2+d3;
    }

    @Override
    public String toString() {
        return ma+ " " + name + " " + date + " "+getTong();
    }
    
}
public class J05009_TIM_THU_KHOA {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<ThiSinh> list=new ArrayList<>();
        double Max=0;
        while(t-->0){
            String name=sc.nextLine();
            String date=sc.nextLine();
            double d1=Double.parseDouble(sc.nextLine());
            double d2=Double.parseDouble(sc.nextLine());
            double d3=Double.parseDouble(sc.nextLine());
            ThiSinh ts=new ThiSinh(name,date,d1,d2,d3);
            Max=Math.max(Max, ts.getTong());
            list.add(ts);
        }
        for (ThiSinh x: list){
            if(x.getTong()==Max){
                System.out.println(x);
            }
//            System.out.println(x);
        }
    }
}
