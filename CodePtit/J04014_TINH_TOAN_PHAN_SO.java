
import java.util.Scanner;

class PhanSo{
  
    private long tu;
    private long mau;
    public PhanSo() {
    }
    public PhanSo(long tu,long mau) {
        this.tu = tu;
        this.mau = mau;
    }
    public PhanSo(PhanSo p) {
        this.tu=p.tu;
        this.mau=p.mau;
    }

    public long getTu() {
        return tu;
    }

    public void setTu(long tu) {
        this.tu = tu;
    }

    public long getMau() {
        return mau;
    }

    public void setMau(long mau) {
        this.mau = mau;
    }
    
    public long gcd(long x,long y){
        while(y!=0){
            long tmp=x%y;
            x=y;
            y=tmp;
        }
        return x;
    }

    @Override
    public String toString() {
        long gc=gcd(this.tu,this.mau);
        return tu/gc+"/"+mau/gc;
    }
    
}
public class J04014_TINH_TOAN_PHAN_SO {
    public static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            long a=sc.nextLong();
            long b=sc.nextLong();
            long c=sc.nextLong();
            long d=sc.nextLong();
            PhanSo C=new PhanSo((a*d+b*c)*(a*d+b*c),(b*d)*(b*d));
            PhanSo D=new PhanSo(a*c*C.getTu(),b*d*C.getMau());
            System.out.println(C+" "+D);
        }
        
    }
}
