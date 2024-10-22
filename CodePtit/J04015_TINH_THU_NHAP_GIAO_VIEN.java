
import java.util.Scanner;
class GiaoVien{
    private String ma,name;
    private long l,pc,bac;

    public GiaoVien() {
    }

    public GiaoVien(String ma, String name, long l, long pc,long bac) {
        this.ma = ma;
        this.name = name;
        this.l = l;
        this.pc = pc;
        this.bac=bac;
    }

    @Override
    public String toString() {
        return ma + " " + name + " " + bac+" "+pc +" "+l;
    }
    
}

public class J04015_TINH_THU_NHAP_GIAO_VIEN {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        String ma=sc.nextLine();
        String name=sc.nextLine();
        long bac=(ma.charAt(2)-'0')*10+(ma.charAt(3)-'0');
        long lcb=sc.nextLong();
        long pc;
        if(ma.substring(0,2).equals("HT")){
            pc=2000000;
        }else if(ma.substring(0,2).equals("HP")){
            pc=900000;
        }else{
            pc=500000;
        }
        long l=bac*lcb+pc;
        GiaoVien gv=new GiaoVien(ma,name,l,pc,bac);
        System.out.println(gv);
    }
}
//HP04
//Tran Quoc Huy
//1578000