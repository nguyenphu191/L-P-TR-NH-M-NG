import java.util.Scanner;
class PhanSo{
  
    private long tu;
    private long mau;

    public PhanSo() {
    }

    public PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public long getTu() {
        return tu;
    }

    public long getMau() {
        return mau;
    }
    public long getgcd(long a,long b){
        while(a!=0){
            long tmp=b%a;
            b=a;
            a=tmp;
        }
        return b;
    }

    @Override
    public String toString() {
        return tu/this.getgcd(tu,mau)+ "/" + mau/this.getgcd(tu,mau);
    }
    
}

public class J04003_PHAN_SO {
    public static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        long tu=sc.nextLong();
        long mau=sc.nextLong();
        PhanSo a=new PhanSo(tu,mau);
        System.out.printf(a.toString());
        
    }
    
}
