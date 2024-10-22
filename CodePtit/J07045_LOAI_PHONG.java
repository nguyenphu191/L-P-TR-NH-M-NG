
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
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
class LoaiPhong implements Comparable<LoaiPhong>{
    private String ma,name;
    private int gia;
    private double phi;

    public LoaiPhong(String s) {
        String a[]=s.split("\\s+");
        this.ma=a[0];
        this.name=a[1];
        this.gia=Integer.parseInt(a[2]);
        this.phi=Double.parseDouble(a[3]);
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

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public double getPhi() {
        return phi;
    }

    public void setPhi(double phi) {
        this.phi = phi;
    }
    
    @Override
    public String toString() {
        return ma+" "+name+" "+gia+" "+phi;
    }
    @Override
    public int compareTo(LoaiPhong p){
        return name.compareToIgnoreCase(p.name);
    }
}
public class J07045_LOAI_PHONG {
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
}
