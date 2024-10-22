
import java.util.Arrays;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class J02027_KHOANG_CACH_NHO_HON_K {
    public static Scanner sc=new Scanner(System.in);
    public static int lower_bound(int array[], int key)
    {
        int lower= 0;
        while (lower< array.length) {
            if (key > array[lower])
                lower++;
            else
                return lower;
        }
        return lower;
    }
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            Arrays.sort(a);
            int dem=0;
            for(int i=0;i<n;i++){
                dem += lower_bound(a,a[i]+k)-(i+1);
        
            }
             System.out.println(dem);
        }
       
    }
}

