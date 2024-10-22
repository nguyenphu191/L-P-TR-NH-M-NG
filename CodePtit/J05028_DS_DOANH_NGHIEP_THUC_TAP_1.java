
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class DoanhNghiep{
    private String ma,name;
    private int sl;

    public DoanhNghiep() {
    }

    public DoanhNghiep(String ma, String name, int sl) {
        this.ma = ma;
        this.name = name;
        this.sl = sl;
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

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    @Override
    public String toString() {
        return ma + " " + name + " " + sl;
    }
    
}
public class J05028_DS_DOANH_NGHIEP_THUC_TAP_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<DoanhNghiep> list=new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String ma=sc.nextLine();
            String name=sc.nextLine();
            int sl=Integer.parseInt(sc.nextLine());
            DoanhNghiep x=new DoanhNghiep(ma,name,sl);
            list.add(x);
        }
        Collections.sort(list,new Comparator<DoanhNghiep>(){
            @Override
            public int compare(DoanhNghiep a,DoanhNghiep b){
                if(a.getSl()==b.getSl()){
                    return a.getMa().compareTo(b.getMa());
                }
                return b.getSl()-a.getSl();
            }
        });
        for(DoanhNghiep x:list){
            System.out.println(x);
        }
    }
}
//4
//VIETTEL
//TAP DOAN VIEN THONG QUAN DOI VIETTEL
//40
//FSOFT
//CONG TY TNHH PHAN MEM FPT - FPT SOFTWARE
//300
//VNPT
//TAP DOAN BUU CHINH VIEN THONG VIET NAM
//200
//SUN
//SUN*
//50