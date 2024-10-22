
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
class Hang{
    private String name,type;
    private double mua,ban;
    private int ma;
    public static int stt=0;

    public Hang() {
    }

    public Hang(String name, String type, double mua, double ban) {
        stt++;
        this.ma=stt;
        this.name = name;
        this.type = type;
        this.mua = mua;
        this.ban = ban;
    }
    public double getLai(){
        return this.ban-this.mua;
    }
    @Override
    public String toString() {
        return ma+ " " + name + " " + type + " " +String.format("%.2f",getLai()) ;
    }
    
}
public class J05010_SAP_XEP_MAT_HANG {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        ArrayList<Hang> list=new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String name=sc.nextLine();
            String type=sc.nextLine();
            double mua=Double.parseDouble(sc.nextLine());
            double ban=Double.parseDouble(sc.nextLine());
            Hang h=new Hang(name,type,mua ,ban);
            list.add(h);
        }
        Collections.sort(list, new Comparator<Hang>(){
            @Override
            public int compare(Hang a,Hang b){
                if(a.getLai()<b.getLai()){
                    return 1;
                }else{
                    return -1;
                }
            }
        });
        for (Hang x: list){
            System.out.println(x);
        }
    }
}
