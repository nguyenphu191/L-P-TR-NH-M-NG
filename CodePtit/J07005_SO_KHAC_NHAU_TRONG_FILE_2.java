
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class J07005_SO_KHAC_NHAU_TRONG_FILE_2 {
    public static void main(String[] args) throws FileNotFoundException,IOException{
        FileInputStream f=new FileInputStream("DATA.IN");
        DataInputStream sc=new DataInputStream(f);
        int[] d=new int[1001];
        for (int i=0;i<100000;i++){
            d[sc.readInt()]++;
        }
        for(int i=0;i<1001;i++){
            if(d[i]>0){
                System.out.println(i+" "+d[i]);
            }
        }
    }
}
