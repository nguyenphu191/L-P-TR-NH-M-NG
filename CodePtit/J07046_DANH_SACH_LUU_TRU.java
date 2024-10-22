
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
class KH implements Comparable<KH>{
    private String ma,name,phong;
    private Long time;
    public static int stt=0;
    
    public KH() {
    }

    public KH(String name, String phong, Long time){
        stt++;
        this.ma = "KH"+String.format("%02d", stt);
        this.name = name;
        this.phong = phong;
        this.time=time;
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

    public String getPhong() {
        return phong;
    }

    public void setPhong(String phong) {
        this.phong = phong;
    }

    public long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    
    @Override
    public String toString() {
        return ma+" "+name+" "+phong+" "+time;
    }

    @Override
    public int compareTo(KH o) {
        return o.time.compareTo(time);
    }
    
    
    
}
public class J07046_DANH_SACH_LUU_TRU {
    public static void main(String[] args) throws FileNotFoundException,IOException, ParseException{
        Scanner sc=new Scanner(new File("KHACH.in"));
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<KH> list=new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        while(t-->0){
            String name=sc.nextLine();
            String phong=sc.nextLine();
            Date nden=sdf.parse(sc.nextLine());
            Date ndi=sdf.parse(sc.nextLine());
            Long time = (ndi.getTime() - nden.getTime()) / (1000L * 60 * 60 * 24);
            list.add(new KH(name,phong,time));
        }
        Collections.sort(list);
        for(KH x: list){
            System.out.println(x);
        }
    }
}
