
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
class MonThi{
    private String ma;
    private String name;
    private String htthi;

    public MonThi() {
    }

    public MonThi(String ma, String name, String htthi) {
        this.ma = ma;
        this.name = name;
        this.htthi = htthi;
    }

    public String getMa() {
        return ma;
    }
    
    @Override
    public String toString() {
        return ma + " " + name + " " + htthi ;
    }  
}
//class DSMT{
//    ArrayList<MonThi> list;
//
//    public DSMT() {
//        this.list=new ArrayList<MonThi>();
//    }
//    public DSMT(ArrayList<MonThi> list) {
//        this.list = list;
//    }
//    public void addmt(MonThi a){
//        list.add(a);
//    }
//}
public class J07058_DANH_SACH_MON_THI {
    public static void main(String[] args) throws FileNotFoundException {
        File f=new File("MONHOC.in");
        Scanner sc=new Scanner(f);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<MonThi> ds=new ArrayList<>();
        while(t-->0){
            String ma=sc.nextLine();
            String name=sc.nextLine();
            String ht=sc.nextLine();
            MonThi mt=new MonThi(ma,name,ht);
            ds.add(mt);
        }
        Collections.sort(ds, new Comparator<MonThi>(){
            @Override
            public int compare(MonThi a,MonThi b){
                return a.getMa().compareTo(b.getMa());
            }
        });
        for(MonThi mt : ds){
            System.out.println(mt);
        }
    }
}
