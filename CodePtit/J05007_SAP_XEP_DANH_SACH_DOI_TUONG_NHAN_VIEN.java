
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
    public int getNamSinh(){
        String tmp=date.substring(6);
        int y=0;
        for(int i=0;i<tmp.length();i++){
            y=y*10+(tmp.charAt(i)-'0');
        }
        return y;
    }
    public int getThang(){
        String tmp=date.substring(3,5);
        int y=0;
        for(int i=0;i<tmp.length();i++){
            y=y*10+(tmp.charAt(i)-'0');
        }
        return y;
    }
    public int getNgay(){
        String tmp=date.substring(0,2);
        int y=0;
        for(int i=0;i<tmp.length();i++){
            y=y*10+(tmp.charAt(i)-'0');
        }
        return y;
    }
    @Override
    public String toString() {
        return ma + " " + name + " " + gt + " " + date + " " + adr + " " + mst + " " + date2;
    }
    
}
public class J05007_SAP_XEP_DANH_SACH_DOI_TUONG_NHAN_VIEN {
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
            list.add(nv);
        }
        Collections.sort(list, new Comparator<NhanVien>(){
            @Override
            public int compare(NhanVien a,NhanVien b){
                if(a.getNamSinh()>b.getNamSinh()){
                    return 1;
                }else if(a.getNamSinh()==b.getNamSinh()&&a.getThang()>b.getThang()){
                    return 1;
                }else if(a.getNamSinh()==b.getNamSinh()&&a.getThang()==b.getThang()&&a.getNgay()>b.getNgay()){
                    return 1;
                }else if(a.getNamSinh()==b.getNamSinh()&&a.getThang()==b.getThang()&&a.getNgay()==b.getNgay()){
                    return 0;
                }else{
                    return -1;
                }
            }
        });
        for (NhanVien x: list){
            System.out.println(x);
        }
    }
}
