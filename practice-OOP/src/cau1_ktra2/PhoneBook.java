/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau1_ktra2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author DELL
 */
public class PhoneBook {
    ArrayList<PhoneNumber> list;

    public PhoneBook() {
        list=new ArrayList<PhoneNumber>();
    }
    public void addPhoneNumber(PhoneNumber pn){
        list.add(pn);
    }   
    public ArrayList<PhoneNumber> listall(){
        ArrayList<PhoneNumber> res=new ArrayList<>();
        for(PhoneNumber pn: list){
            res.add(pn);
        }
        return res;
    }
    public ArrayList<PhoneNumber> timmavung(int mavung){
        ArrayList<PhoneNumber> res=new ArrayList<>();
        for(PhoneNumber pn: list){
            if(pn.getMavung()==mavung){
                res.add(pn);
            }
        }
        return res;
    }
    public Map<Integer,Integer> counttheovung(){
        Map<Integer,Integer> res=new HashMap<>();
        for(PhoneNumber x: list){
            int mavung=x.getMavung();
            res.put(mavung, res.getOrDefault(mavung, 0)+1);
        }
        return res;
    }
//    public ArrayList<PhoneNumber> lietke(String loai){
//        ArrayList<PhoneNumber> res=new ArrayList<>();
//        if(loai.equals("Noi Dia")){
//            for(PhoneNumber pn: noidia){
//                res.add(pn);
//            }
//        }else if(loai.equals("Quoc Te")){
//            for(PhoneNumber pn: noidia){
//                res.add(pn);
//            }
//        }else{
//            for(PhoneNumber pn: noidia){
//                res.add(pn);
//            }
//            for(PhoneNumber pn: noidia){
//                res.add(pn);
//            }
//        }
//        return res;
//    }
}
