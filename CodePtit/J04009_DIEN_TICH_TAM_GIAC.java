
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
class Point{
    private double x;
    private double y;

    public Point() {
        
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Point(Point p) {
        this.x=p.x;
        this.y=p.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public double distance(Point pk){
        return Math.sqrt(Math.pow(this.x-pk.x, 2)+Math.pow(this.y-pk.y, 2));
    }
    public double distance(Point p1,Point p2){
        return Math.sqrt(Math.pow(p1.x-p2.x, 2)+Math.pow(p1.y-p2.y, 2));
    }

    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }
}
public class J04009_DIEN_TICH_TAM_GIAC {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            double a,b,a1,b1,a2,b2;
            a=sc.nextDouble();
            b=sc.nextDouble();
            a1=sc.nextDouble();
            b1=sc.nextDouble();
            a2=sc.nextDouble();
            b2=sc.nextDouble();
            Point x=new Point(a,b);
            Point y=new Point(a1,b1);
            Point z=new Point(a2,b2);
            
            double c1=x.distance(y);
            double c2=x.distance(z);
            double c3=y.distance(z);
            if((c1+c2<=c3)||(c1+c3<=c2)||(c2+c3<=c1)){
                System.out.println("INVALID");
                continue;
            } 
            double s=1 / 4f * Math.sqrt((c1 + c2 + c3) * (c1 + c2 - c3) * (c1 - c2 + c3) * (-c1 + c2 + c3));
            System.out.println(String.format("%.2f",s));
        }
        
    }
}
