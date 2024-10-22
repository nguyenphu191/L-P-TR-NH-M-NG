import java.util.Scanner;
class NhanVien{
    private String ma="00001";
    private String name,gt,date,ad,mst,date2;

    public NhanVien() {
        name=""; gt="";date=""; ad=""; mst="";date2="";
    }

    public NhanVien(String name, String gt, String date, String ad, String mst, String date2) {
        this.name = name;
        this.gt = gt;
        this.date = date;
        this.ad = ad;
        this.mst = mst;
        this.date2 = date2;
    }

    @Override
    public String toString() {
        return ma+" "+name+" "+gt+" "+date+" "+ad+" "+mst+" "+date2;
    }
    
}
public class J04007_KHAI_BAO_LOP_NHAN_VIEN {
    public static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) {
        String name=sc.nextLine();
        String gt=sc.nextLine();
        String date=sc.nextLine();
        String ad=sc.nextLine();
        String mst=sc.nextLine();
        String date2=sc.nextLine();
        NhanVien nv=new NhanVien(name,gt,date,ad,mst,date2);
        System.out.println(nv);
    }
}
//Nguyen Van Hoa
//Nam
//22/11/1982
//Mo Lao-Ha Dong-Ha Noi
//8333123456
//31/12/2013