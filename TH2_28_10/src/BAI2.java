
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class BAI2 {
    public static void main(String[] args) {
        QuanLyTuLieu q=new QuanLyTuLieu();
        Scanner in=new Scanner(System.in);
        q.nhapBao(in);
        q.nhapSachHoc(in);
        q.out();
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
    public void setMa(){
        super.setMa("");
        String name=getTen().toUpperCase();
        String x=name.charAt(0)+String.format("%03d", stt);
        setMa(x);
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
        return super.getMa()+" "+ten +" " + ngay +" "+ getNxb()+" "+Math.round(getGia());
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
    public void setMa(){
        super.setMa("");
        String name=getTen();
        String[] arr=name.split("\\s+");
        String x=arr[0].toUpperCase()+String.format("%03d", stt);
        setMa(x);
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
        return super.getMa()+" "+getTen()+" "+getNxb()+" "+getSot()+" "+Math.round(getGia());
    }
    
}
class QuanLyTuLieu{
    private List<TuLieu> list=new ArrayList<>();

    public QuanLyTuLieu() {
    }

    public List<TuLieu> getList() {
        return list;
    }

    public void setList(List<TuLieu> list) {
        this.list = list;
    }
    public void nhapBao(Scanner in){
        String ten=in.nextLine();
        String nxb=in.nextLine();
        String ngay=in.nextLine();
        double gia=Double.parseDouble(in.nextLine());
        int sl=Integer.parseInt(in.nextLine());
        Bao a=new Bao(ten,nxb,ngay,gia,sl);
        a.setMa();
        list.add(a);
    }
    public void nhapSachHoc(Scanner in){
        String ten=in.nextLine();
        String tg=in.nextLine();
        int sot=Integer.parseInt(in.nextLine());
        String nxb=in.nextLine();
        double gia=Double.parseDouble(in.nextLine());
        int sl=Integer.parseInt(in.nextLine());
        SachHoc a=new SachHoc(ten,tg,sot,nxb,gia,sl);
        a.setMa();
        list.add(a);
    }
    public void out(){
        for(TuLieu x: list){
            System.out.println(x);
        }
    }
}
//nhi dong
//thieu nhi
//01/06/2023
//23000
//100
//mua ha
//Le an Thu
//80
//kim dong
//90000
//200