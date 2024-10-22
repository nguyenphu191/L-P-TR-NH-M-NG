
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
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
class MonHoc{
    private String ma,name;
    private int sl;

    public MonHoc() {
    }

    public MonHoc(String ma, String name, int sl) {
        this.ma = ma;
        this.name = name;
        this.sl = sl;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    @Override
    public String toString() {
        return ma+" "+name+" "+sl;
    }
    
}
public class J07034_DANH_SACH_MON_HOC {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc =new Scanner(new File("MONHOC.in"));
        ArrayList<MonHoc> list=new ArrayList<>();
        int t= Integer.parseInt(sc.nextLine());
        while(t-->0){
            String ma=sc.nextLine();
            String name=sc.nextLine();
            int sl=Integer.parseInt(sc.nextLine());
            list.add(new MonHoc(ma,name,sl));
        }
        Collections.sort(list, new Comparator<MonHoc>(){
            @Override
            public int compare(MonHoc a,MonHoc b){
                return a.getName().compareToIgnoreCase(b.getName());
            }
        });
        for(MonHoc x:list){
            System.out.println(x);
        }
    }
}
