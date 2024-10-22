
import java.util.Scanner;


public class BAI1 {
    public static void main(String[] args) {
        Bao b=new Bao("Hoa hoc tro", "Tien Phong", "02/04/2023", 23000, 100);
        System.out.println(b);
        SachHoc s=new SachHoc("Toan cao cap", "Nhat tue", 120, "Giao duc", 80000, 300);
        System.out.println(s);
    }
}
class TuLieu{
    public static int stt=0;
    private String ma,nxb;
    private double gia;
    private int sl;

    public TuLieu() {
    }

    public TuLieu(String nxb, double gia, int sl) {
        stt++;
        this.nxb = nxb;
        this.gia = gia;
        this.sl = sl;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getNxb() {
        return nxb;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }
    
}
interface ITuLieu{
    public double getGia();
}
class Bao extends TuLieu implements ITuLieu{
    private String ngay,ten;

    public Bao() {
    }

    public Bao(String ten,String nxb,String ngay, double gia, int sl) {
        super(nxb, gia, sl);
        this.ngay = ngay;
        this.ten = ten;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
    @Override
    public String getMa(){
        String name=getTen().toUpperCase();
        String x=name.charAt(0)+String.format("%03d", stt);
        return x;
    }
    @Override
    public double getGia(){
        double x=super.getGia();
        if(getSl()>200){
            x=x*95/100;
        }
        if(getNgay().charAt(3)=='0'&&(getNgay().charAt(4)=='1'||getNgay().charAt(4)=='2')){
            x=x*95/100;
        }
        return x;
    }
    @Override
    public String toString() {
        return getMa()+" "+ten +" " + ngay +" "+ getNxb()+" "+Math.round(getGia());
    }
}
class SachHoc extends TuLieu implements ITuLieu{
    private String ten,tg;
    private int sot;

    public SachHoc() {
    }

    public SachHoc(String ten, String tg, int sot, String nxb, double gia, int sl) {
        super(nxb, gia, sl);
        this.ten = ten;
        this.tg = tg;
        this.sot = sot;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTg() {
        return tg;
    }

    public void setTg(String tg) {
        this.tg = tg;
    }

    public int getSot() {
        return sot;
    }

    public void setSot(int sot) {
        this.sot = sot;
    }
    @Override
    public String getMa(){
        String name=getTen();
        String[] arr=name.split("\\s+");
        String x=arr[0].toUpperCase()+String.format("%03d", stt);
        return x;
    }
    @Override
    public double getGia(){
        double x=super.getGia();
        if(getSot()<=300){
            x=x*95/100;
        }else if(getSot()<=500){
            x=x*9/10;
        }else if(getSl()>500){
            x=x*85/100;
        }
        if(getSl()>500){
            x=x*9/10;
        }
        return x;
    }
    @Override
    public String toString() {
        return getMa()+" "+getTen()+" "+getNxb()+" "+getSot()+" "+Math.round(getGia());
    }
    
}
