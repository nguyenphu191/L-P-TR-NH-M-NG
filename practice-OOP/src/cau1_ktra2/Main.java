/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau1_ktra2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Main {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        PhoneBook noidia=new PhoneBook();
        PhoneBook quocte=new PhoneBook();
        PhoneBook allnumber=new PhoneBook();
        noidia.addPhoneNumber(new PhoneNumber(184,1234567));
        noidia.addPhoneNumber(new PhoneNumber(84,7654321));
        quocte.addPhoneNumber(new IntPhoneNumber(42,88,3333333));
        quocte.addPhoneNumber(new IntPhoneNumber(12,48,6666666));
        allnumber.addPhoneNumber(new PhoneNumber(184,1234567));
        allnumber.addPhoneNumber(new PhoneNumber(84,7654321));
        allnumber.addPhoneNumber(new IntPhoneNumber(42,88,3333333));
        allnumber.addPhoneNumber(new IntPhoneNumber(12,48,6666666));
        while(true){
            System.out.println("Nhập lựa chọn : ");
            System.out.println("1. Them sdt");
            System.out.println("2. Tim sdt theo ma vung");
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
                    System.out.println("NoiDia hay Quocte?");
                    String s=sc.nextLine();
                    if(s.equals("NoiDia")){
                        System.out.println("Nhap ma vung: "); int mavung=sc.nextInt();
                        System.out.println("Nhap noi vung: "); int noivung=sc.nextInt();
                        noidia.addPhoneNumber(new PhoneNumber(mavung,noivung));
                        allnumber.addPhoneNumber(new PhoneNumber(mavung,noivung));
                    }else{
                        System.out.println("Nhap ma quoc gia: "); int mqg=sc.nextInt();
                        System.out.println("Nhap ma vung: "); int mavung=sc.nextInt();
                        System.out.println("Nhap noi vung: "); int noivung=sc.nextInt();
                        quocte.addPhoneNumber(new IntPhoneNumber(mqg,mavung,noivung));
                        allnumber.addPhoneNumber(new IntPhoneNumber(mqg,mavung,noivung));
                    }
                }
                case 2->{
                    System.out.println("Nhap ma vung can tim: ");
                    int mv=sc.nextInt();
                    ArrayList<PhoneNumber> listnd=noidia.listall();
                    System.out.println("Noi dia: ");
                    for(PhoneNumber x: listnd){
                        if(x.getMavung()==mv){
                            System.out.println(x);
                        } 
                    }
                    ArrayList<PhoneNumber> listqt=quocte.listall();
                    System.out.println("Quoc te: ");
                    for(PhoneNumber x: listqt){
                        if(x.getMavung()==mv){
                            System.out.println(x);
                        } 
                    }
                }
                case 3->{
                    System.out.println("Nhap danh sach muon xem : NoiDia-QuocTe-ALL");
                    String s=sc.nextLine();
                    ArrayList<PhoneNumber> listnd=noidia.listall();
                    ArrayList<PhoneNumber> listqt=quocte.listall();
                    if(s.equals("NoiDia")){
                        for(PhoneNumber x: listnd){
                            System.out.println(x);
                        } 
                    }else if(s.equals("QuocTe")){
                        for(PhoneNumber x: listqt){
                            System.out.println(x);
                        } 
                    }else{
                        for(PhoneNumber x: listnd){
                            System.out.println(x);
                        } 
                        for(PhoneNumber x: listqt){
                            System.out.println(x);
                        } 
                    }
                }
                case 4->{
                    Map<Integer,Integer> cmv = allnumber.counttheovung();
                    for(Map.Entry<Integer,Integer> entry : cmv.entrySet()){
                        System.out.println(entry.getKey()+" : "+entry.getValue()+" Phone Numbers");
                    }
                }
                default -> System.out.println("Nhap lai");
            }
        }
//        ArrayList<PhoneNumber> allnumber=list.listall();
//        for(PhoneNumber x: allnumber){
//            System.out.println(x);
//        }
    }
}
