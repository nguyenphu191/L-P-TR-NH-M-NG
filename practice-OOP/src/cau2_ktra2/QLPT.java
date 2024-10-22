/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau2_ktra2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class QLPT implements ChucNang{
    ArrayList<PTGT> list;
    
    public static Scanner sc=new Scanner(System.in);
    public QLPT() {
        list=new ArrayList<>();
        list.add(new XeMay(50,"xm01","honda","vang",2022,2000));
        list.add(new OTo("dong co 1",4,"ot002","mada","trang",2023,50000));
        list.add(new XeTai(1000,"xt003","Benz","Xanh",2010,20000));
    }
    
    @Override
    public void addpt(PTGT p) {
        list.add(p);
    }
    
    @Override
    public void inlist(Scanner in) {
        for(PTGT x: list){
            System.out.println(x);
        }
        System.out.println("Tong so xe: "+list.size());
    }

//    @Override
//    public void timPT() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//
//    @Override
//    public void timPT2() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//
//    @Override
//    public void Tim1Truong() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
    
}
