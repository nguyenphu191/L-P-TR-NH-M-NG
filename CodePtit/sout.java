
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
class sout {
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
        String s=sc.nextLine();
        String hs="B21DCCN592";
        String k=hs.substring(3,7);
        String a[]=s.split("\\s+");
        for(String x: a){
            System.out.println(x[0]);
        }
        
    }
}
