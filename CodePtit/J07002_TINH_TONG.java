
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class J07002_TINH_TONG {
    public static void main(String[] args) throws FileNotFoundException{
        File f=new File("DATA.in");
        Scanner sc=new Scanner(f);
        long sum=0;
        while(sc.hasNext()){
            String w=sc.next();
            String rs="";
            for(int i=0;i<w.length();i++){
                if(w.charAt(i)>='0'&&w.charAt(i)<='9'){
                    rs+=w.charAt(i);
                }else if(rs.length()>9){
                    rs="";
                }else if(rs!=""){
                    sum+=Integer.parseInt(rs);
                    rs="";
                }
            }
            if(rs!=""&&rs.length()<=9){
                sum+=Integer.parseInt(rs);
            }
        }
        System.out.println(sum);
    }
}
