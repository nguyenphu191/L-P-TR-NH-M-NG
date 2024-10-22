
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class J07004_SO_KHAC_NHAU_TRONG_FILE_1 {
    public static void main(String[] args) throws FileNotFoundException{
        File f=new File("DATA.in");
        Scanner sc=new Scanner(f);
        HashSet<Integer> se = new HashSet<>();
        int[] d=new int[1001];
        while(sc.hasNextInt()){
            int k=sc.nextInt();
            se.add(k);
            d[k]++;
        }
        for(int x: se){
            System.out.println(x+" "+d[x]);
        }
    }
}
