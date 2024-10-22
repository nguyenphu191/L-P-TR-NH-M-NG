
import java.math.BigInteger;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class J03033_BOI_SO_CHUNG_NHO_NHAT {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int t=Integer.parseInt(sc.next());
        while(t-->0){
            String a=sc.next();
            String b=sc.next();
            BigInteger aa=new BigInteger(a);
            BigInteger bb=new BigInteger(b);
            System.out.println((aa.multiply(bb)).divide(aa.gcd(bb)));
        }
    }
}
