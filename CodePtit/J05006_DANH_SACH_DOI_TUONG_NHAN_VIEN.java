
import java.util.ArrayList;
import java.util.Scanner;

class NhanVien{
    private String ma,name,gt,date,adr,mst,date2;
    public static int stt=0;

    public NhanVien() {
    }

    public NhanVien(String name, String gt, String date, String adr, String mst, String date2) {
        stt++;
        this.ma=String.format("%05d", stt);
        this.name = name;
        this.gt = gt;
        this.date = date;
        this.adr = adr;
        this.mst = mst;
        this.date2 = date2;
    }

    @Override
    public String toString() {
        return ma + " " + name + " " + gt + " " + date + " " + adr + " " + mst + " " + date2;
    }
    
}
public class J05006_DANH_SACH_DOI_TUONG_NHAN_VIEN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.next());
        ArrayList<NhanVien> list=new ArrayList<NhanVien>();
        sc.nextLine();
        while(t-->0){
            String name=sc.nextLine();
            String gt=sc.nextLine();
            String date=sc.nextLine();
            String adr=sc.nextLine();
            String mst=sc.nextLine();
            String date2=sc.nextLine();
            NhanVien nv=new NhanVien(name,gt,date,adr,mst,date2);
            System.out.println(nv);
            list.add(nv);
        }
        for (NhanVien x: list){
            System.out.println(x);
        }
    }
}
