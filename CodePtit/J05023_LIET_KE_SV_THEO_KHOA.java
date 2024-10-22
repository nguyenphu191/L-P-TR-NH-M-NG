
import java.util.ArrayList;
import java.util.Scanner;

class SinhVien{
    private String msv,name,lop,mail;

    public SinhVien() {
    }

    public SinhVien(String msv, String name, String lop, String mail) {
        this.msv = msv;
        this.name = name;
        this.lop = lop;
        this.mail = mail;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return msv + " " + name + " " + lop + " " + mail;
    }
    
}
public class J05023_LIET_KE_SV_THEO_KHOA {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<SinhVien> list=new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String msv=sc.nextLine();
            String name=sc.nextLine();
            String lop=sc.nextLine();
            String mail=sc.nextLine();
            SinhVien a=new SinhVien(msv,name,lop,mail);
            list.add(a);
        }
        int tv=Integer.parseInt(sc.nextLine());
        while(tv-->0){
            int k=sc.nextInt();
            System.out.println("DANH SACH SINH VIEN KHOA "+ k +":");
            for(SinhVien x:list){
                int tmp=Integer.parseInt("20"+x.getMsv().substring(1, 3));
                if(tmp==k){
                    System.out.println(x);
                }
            }
        }
//        for(SinhVien x: list){
//            System.out.println(x);
//        }
    }
}
//4
//B16DCCN011
//Nguyen Trong Duc Anh
//D16CNPM1
//sv1@stu.ptit.edu.vn
//B15DCCN215
//To Ngoc Hieu
//D15CNPM3
//sv2@stu.ptit.edu.vn
//B15DCKT150
//Nguyen Ngoc Son
//D15CQKT02-B
//sv3@stu.ptit.edu.vn
//B15DCKT199
//Nguyen Trong Tung
//D15CQKT02-B
//sv4@stu.ptit.edu.vn
//1
//2015

