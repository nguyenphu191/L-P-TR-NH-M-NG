
import java.util.Scanner;
class SinhVien{
    private String ma="B20DCCN001";
    private String name,lop,date;
    private double diem;

    public SinhVien() {
        name=""; lop=""; date="";
        diem=0;
    }

    public SinhVien(String name, String lop, String date, double diem) {
        this.name = name;
        this.lop = lop;
        this.date = date;
        this.diem = diem;
    }

    public String getDate() {
        String d ="";
        String m;
        String y;
        if (date.charAt(5)=='/'&&date.charAt(2)=='/'){
            d=date.substring(0,2);
            m=date.substring(3,5);
            y=date.substring(6);
        }else if(date.charAt(5)!='/'&&date.charAt(2)=='/'){
           d=date.substring(0,2);
           m="0"+date.substring(3,4);
           y=date.substring(5);
        }else if(date.charAt(1)=='/'&&date.charAt(4)=='/'){
            d="0"+date.substring(0,1);
            m=date.substring(2,4);
            y=date.substring(5);
        }else{
            d="0"+date.substring(0,1);
            m="0"+date.substring(2,3);
            y=date.substring(4);
        }
        return d+"/"+m+"/"+y;
    }

    @Override
    public String toString() {
        return ma+" "+name+" "+lop+" "+getDate()+" "+String.format("%.2f",diem);
    }
    
}

public class J04006_KHAI_BAO_LOP_SINH_VIEN {
    public static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) {
        String name=sc.nextLine();
        String lop=sc.nextLine();
        String date=sc.nextLine();
        double x=sc.nextDouble();
        SinhVien sv=new SinhVien(name,lop,date,x);
        System.out.println(sv);
    }
}
//Nguyen Hoa Binh
//D20CQCN04-B
//2/2/2002
//2