
import java.util.ArrayList;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;

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
        this.cla = cla;
        this.mark = mark;
        this.name=name;
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
public class J05004_DANH_SACH_DOI_TUONG_SINH_VIEN_2 {
    public static String chuanhoaten(String name){
        name=name.toUpperCase().trim();
        String a[]=name.split("\\s+");
        String res="";
        for (String i:a){
            res+=i.substring(0,1)+i.substring(1).toLowerCase()+" ";
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> list=new ArrayList<>();
        while(n-->0){
            String name=chuanhoaten(sc.nextLine());
            String cla=sc.nextLine();
            String date=sc.nextLine();
            double mark=Double.parseDouble(sc.nextLine());
            SinhVien sv=new SinhVien(name,date,cla,mark);
            list.add(sv);
        }
        
        for(SinhVien x:list){
            System.out.println(x);
        }
    }
}

