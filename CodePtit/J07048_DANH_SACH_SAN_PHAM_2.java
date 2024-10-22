
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
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
class SP{
    private String ma,name;
    private int ban,bh;

    public SP() {
    }

    public SP(String ma, String name, int ban, int bh) {
        this.ma = ma;
        this.name = name;
        this.ban = ban;
        this.bh = bh;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBan() {
        return ban;
    }

    public void setBan(int ban) {
        this.ban = ban;
    }

    public int getBh() {
        return bh;
    }

    public void setBh(int bh) {
        this.bh = bh;
    }

    @Override
    public String toString() {
        return ma+" "+name+" "+ban+" "+bh;
    }
    
}
public class J07048_DANH_SACH_SAN_PHAM_2 {
    public static void main(String[] args)throws FileNotFoundException{
        Scanner sc=new Scanner(new File("SANPHAM.in"));
        ArrayList<SP> list=new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String ma=sc.nextLine();
            String name=sc.nextLine();
            int ban=Integer.parseInt(sc.nextLine());
            int bh=Integer.parseInt(sc.nextLine());
            list.add(new SP(ma,name,ban,bh));
            
        }
        Collections.sort(list,new Comparator<SP>(){
            @Override
            public int compare(SP a,SP b){
                if (a.getBan()==b.getBan()){
                    return a.getMa().compareTo(b.getMa());
                }
                return b.getBan()-a.getBan();
            }
        });
        for(SP i:list){
            System.out.println(i);
        }
    }
           
}
