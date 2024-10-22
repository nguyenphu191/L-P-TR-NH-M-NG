
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class J03026_XAU_KHAC_NHAU_DAI_NHAT {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int t=Integer.parseInt(sc.next());
        while(t-->0){
            String a=sc.next();
            String b=sc.next();
            if(!a.equals(b)){
                System.out.println(Math.max(a.length(), b.length()));
            }else{
                System.out.println("-1");
            }
        }
    }
}
