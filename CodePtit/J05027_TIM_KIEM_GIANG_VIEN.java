
import java.util.ArrayList;
import java.util.Scanner;

class GiangVien{
    private String ma,name,major;
    public static int stt=0;

    public GiangVien() {
    }

    public GiangVien(String name, String major) {
        stt++;
        this.ma="GV"+String.format("%02d",stt);
        this.name = name;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getMajor() {
        String[] a=this.major.toUpperCase().split("\\s+");
        String res="";
        for(String x: a){
            res+=Character.toString(x.charAt(0));
        }
        return res;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return ma + " " + name + " " + getMajor();
    }
    
}
public class J05027_TIM_KIEM_GIANG_VIEN {
    public static String trave(String s){
        String[] a=s.toUpperCase().split("\\s+");
        String res="";
        for(String x: a){
            res+=Character.toString(x.charAt(0));
        }
        return res;
    }
    public static Scanner sc=new Scanner (System.in);
    public static void main(String[] args) {
        ArrayList<GiangVien> list=new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String name=sc.nextLine();
            String major=sc.nextLine();
            GiangVien gv=new GiangVien(name,major);
            list.add(gv);
        }
        int k=Integer.parseInt(sc.nextLine());
        while(k-->0){
            String s=sc.nextLine();
            System.out.printf("DANH SACH GIANG VIEN THEO TU KHOA "+s+":\n");
            for(GiangVien x: list){
                String tmp=x.getName().toLowerCase();
                String ss=s.toLowerCase();
                if(tmp.contains(ss)){
                    System.out.println(x);
                }
            }
        }
        
    }
}
//3
//Nguyen Manh Son
//Cong nghe phan mem
//Vu Hoai Nam
//Khoa hoc may tinh
//Dang Minh Tuan
//An toan thong tin
//1
//aN

