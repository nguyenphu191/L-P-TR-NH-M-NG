
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;
import java.util.ArrayList;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class J07006_SO_KHAC_NHAU_TRONG_FILE_3 {
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        FileInputStream f=new FileInputStream("DATA.in");
        ObjectInputStream sc=new ObjectInputStream(f);
        List<Integer> list=(ArrayList<Integer>)sc.readObject();
        int d[]=new int[1001];
        for (Integer x : list){
            d[x]++;
        }
        for(int i=0;i<1001;i++){
            if(d[i]>0){
                System.out.println(i+" "+d[i]);
            }
            
        }
    }
}
