
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

public class J04004_TONG_PHAN_SO {
    public static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) {
        long a=sc.nextLong();
        long b=sc.nextLong();
        long c=sc.nextLong();
        long d=sc.nextLong();
        PhanSo x=new PhanSo(a*d+b*c,b*d);
        System.out.println(x);
    }
    
}
