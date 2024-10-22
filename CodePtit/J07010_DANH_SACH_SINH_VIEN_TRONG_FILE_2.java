
import java.io.File;
import java.io.FileNotFoundException;
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
class SinhVien{
    public static int stt=0;
    private String masv;
    private String name;
    private String date;
    private String cla;
    private double mark;

    public SinhVien() {
    }
    public SinhVien( String name,String date, String cla, double mark) {
        stt++;
        this.masv = "B20DCCN"+String.format("%03d", stt);
        this.name = name;
        this.cla = cla;
        this.mark = mark;
        String a[]=date.split("/");
        String day=String.format("%02d", Integer.parseInt(a[0]));
        String month=String.format("%02d", Integer.parseInt(a[1]));
        String year=String.format("%02d", Integer.parseInt(a[2]));
        this.date=day+"/"+month+"/"+year;
    }
    @Override
    public String toString() {
        return masv + " " + name + " " + cla + " " + date + " " + String.format("%.2f", mark);
    } 
}
public class J07010_DANH_SACH_SINH_VIEN_TRONG_FILE_2 {
    public static void main(String[] args) throws FileNotFoundException{
        File f=new File("SV.in");
        Scanner sc=new Scanner(f);
        int n=Integer.parseInt(sc.nextLine());
//        while(sc.hasNextLine()){
//            System.out.println(sc.nextLine());
//        }
//        ArrayList<SinhVien> list=new ArrayList<>();
        while(n-->0){
            String name=sc.nextLine();
            String cla=sc.nextLine();
            String date=sc.nextLine();
            double mark=Double.parseDouble(sc.nextLine());
            SinhVien sv=new SinhVien(name,date,cla,mark);
            System.out.println(sv);
//            list.add(sv);
        }
        
//        for(SinhVien x:list){
//            System.out.println(x);
//        }
    }
}
