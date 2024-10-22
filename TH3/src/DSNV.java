/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
class NhanVien implements Serializable{
    private String ma,name;
    private boolean gt;
    private double lg;

    public NhanVien() {
    }

    public NhanVien(String ma, String name, boolean gt, double lg) {
        this.ma = ma;
        this.name = name;
        this.gt = gt;
        this.lg = lg;
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

    public boolean isGt() {
        return gt;
    }

    public void setGt(boolean gt) {
        this.gt = gt;
    }
    public String getGt(boolean k){
        if (k==true){
            return "nam";
        }
        return "nu";
    }
    public double getLg() {
        return lg;
    }

    public void setLg(double lg) {
        this.lg = lg;
    }

    @Override
    public String toString() {
        return ma + " " + name + " " + getGt(gt) + " " + Math.round(lg) ;
    }
    
}
public class DSNV {
    public static void main(String[] args) throws FileNotFoundException {
        File f=new File("nhanvien.dat");
        Scanner sc=new Scanner(f);
        ArrayList<NhanVien> list=new ArrayList<>();
        while(sc.hasNextLine()){
            String s=sc.nextLine();
            String[] line=s.split("/");
            String ma=line[0];
            String name=line[1];
            boolean gt=Boolean.parseBoolean(line[2]);
       
            double luong=Double.parseDouble(line[3]);
            list.add(new NhanVien(ma,name,gt,luong));
        }
        Collections.sort(list, new Comparator<NhanVien>(){
            @Override
            public int compare(NhanVien a, NhanVien b){
                return b.getName().compareTo(a.getName());
            }
        });
        for(NhanVien i :list){
            System.out.println(i);
        }
    }
        
}
