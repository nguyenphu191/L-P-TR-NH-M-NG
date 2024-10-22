
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
class DN{
    private String ma,name;
    private int sl;

    public DN(String ma, String name, int sl) {
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
public class J07037_DANH_SACH_DOANH_NGHIEP {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc=new Scanner(new File("DN.in"));
        ArrayList<DN> list=new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String ma=sc.nextLine();
            String name=sc.nextLine();
            int sl=Integer.parseInt(sc.nextLine());
            list.add(new DN(ma,name,sl));
        }
        Collections.sort(list, new Comparator<DN>(){
            @Override
            public int compare(DN a,DN b){
                return a.getMa().compareToIgnoreCase(b.getMa());
            }
        });
        for(DN x:list){
            System.out.println(x);
        }
    }
}
