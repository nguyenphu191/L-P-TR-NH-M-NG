/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau2_ktra2;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class MAIN {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        QLPT list=new QLPT();
        list.inlist(sc);
        System.out.println("them pt: ");
        while(true){
            System.out.println("Nhập lựa chọn : ");
            System.out.println("1. Them pt");
            System.out.println("2. In ra danh sach phuong tien");
            System.out.println("3. In ra cac sdt theo nhu cau");
            System.out.println("4. Tinh tong sdt theo vung");
            int lc=sc.nextInt();
            sc.nextLine();
            switch (lc) {
                case 0->{
                    System.out.println("Bye");
                    System.exit(0);
                }
                case 1->{
                    System.out.println(" Lua chon 1 de nhap xe may, 2 cho oto, 3 cho xe tai");
                    System.out.println("Lua chon : "); int lchon=sc.nextInt();
                    sc.nextLine();
                    if(lchon==1){
                        int cs=sc.nextInt();
                        String ma=sc.next();
                        sc.nextLine();
                        String hsx=sc.nextLine();
                        String mau=sc.nextLine(); 
                        int namsx=sc.nextInt();
                        int gia=sc.nextInt();
                        list.addpt(new XeMay(cs,ma,hsx,mau,namsx,gia));
                    }else if(lchon==2){
                        String ldc=sc.nextLine();
                        int socho=sc.nextInt();
                        String ma=sc.next();
                        sc.nextLine();
                        String hsx=sc.nextLine();
                        String mau=sc.nextLine(); 
                        int namsx=sc.nextInt();
                        int gia=sc.nextInt();
                        list.addpt(new OTo(ldc,socho,ma,hsx,mau,namsx,gia));
                    }else if(lchon==3){
                        int trongtai=sc.nextInt();
                        String ma=sc.next();
                        sc.nextLine();
                        String hsx=sc.nextLine();
                        String mau=sc.nextLine(); 
                        int namsx=sc.nextInt();
                        int gia=sc.nextInt();
                        list.addpt(new XeTai(trongtai,ma,hsx,mau,namsx,gia));
                    }
                }
                case 2->{
                    list.inlist(sc);
                }
                case 3->{
                    
                }
//                case 4->{
//                    Map<Integer,Integer> cmv = allnumber.counttheovung();
//                    for(Map.Entry<Integer,Integer> entry : cmv.entrySet()){
//                        System.out.println(entry.getKey()+" : "+entry.getValue()+" Phone Numbers");
//                    }
//                }
                default -> System.out.println("Nhap lai");
            }
        }
    }
}
