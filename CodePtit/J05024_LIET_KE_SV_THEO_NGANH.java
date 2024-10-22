
import java.util.ArrayList;
import java.util.Scanner;

class SinhVien{
    private String msv,name,lop,mail;

    public SinhVien() {
    }

    public SinhVien(String msv, String name, String lop, String mail) {
        this.msv = msv;
        this.name = name;
        this.lop = lop;
        this.mail = mail;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return msv + " " + name + " " + lop + " " + mail;
    }
    
}
public class J05024_LIET_KE_SV_THEO_NGANH {
    public static String trave(String s){
        if(s.equals("Cong nghe thong tin")){
            return "DCCN";
        }else if(s.equals("Ke toan")){
            return "DCKT";
        }else if(s.equals("An toan thong tin")){
            return "DCAT";
        }else if(s.equals("Vien thong")){
            return "DCVT";
        }else{
            return "DCDT";
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<SinhVien> list=new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String msv=sc.nextLine();
            String name=sc.nextLine();
            String lop=sc.nextLine();
            String mail=sc.nextLine();
            SinhVien a=new SinhVien(msv,name,lop,mail);
            list.add(a);
        }
        int k=Integer.parseInt(sc.nextLine());
        while(k-->0){
            String s=sc.nextLine();
            String nganh=trave(s);
            System.out.println("DANH SACH SINH VIEN NGANH "+ s.toUpperCase() +":");
            if(nganh.equals("DCCN")||nganh.equals("DCAT")){
                for(SinhVien x: list){
                    String tmp=x.getMsv().substring(3,7);
                    if(tmp.equals(nganh)&&x.getLop().charAt(0)!='E'){
                        System.out.println(x);
                    }
                }
            }else{
                for(SinhVien x: list){
                    String tmp=x.getMsv().substring(3,7);
                    if(tmp.equals(nganh)){
                        System.out.println(x);
                    }
                }
            }
            
        }
        
    }
}
