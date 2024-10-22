
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
class NhanVien{
    private String name;
    public static int stt;
    private String ma;
    private int lcb;
    private int snc;
    private String cv;
    private int pc;
    public NhanVien() {
    }

    public NhanVien(String name, int lcb, int snc, String cv) {
        stt++;
        this.ma="NV"+String.format("%02d",stt);
        this.name = name;
        this.lcb = lcb;
        this.snc = snc;
        this.cv = cv;
        switch (cv) {
            case "GD":
                pc= 250000;
                break;
            case "PGD":
                pc= 200000;
                break;
            case "TP":
                pc= 180000;
                break;
            case "NV":
                pc=150000;
                break;
        }
    }
 
    public int getThuong(){
        int l=snc*lcb;
        if(snc>=25){
            return (l*2/10);
        }else if(snc>=22&&snc<25){
            return (l/10);
        }
        return 0;
    }
    public int getLuong(){
        int l=snc*lcb;
        return l+getThuong()+pc;
    }
    
    @Override
    public String toString() {
        return ma+" "+name+" " +snc*lcb+" "+getThuong()+" "+pc+" "+getLuong();
    }
    
}
public class J04012_BAI_TOAN_TINH_CONG {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int lcb=sc.nextInt();
        int snc=sc.nextInt();
        String cv=sc.next();
        NhanVien nv=new NhanVien(name,lcb,snc,cv);
        System.out.println(nv);
    }
}
