
import static java.lang.Math.*;
import java.util.Scanner;
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

public class J04001_KHAI_BAO_LOP_POINT {
    public static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            double x=sc.nextDouble();
            double y=sc.nextDouble();
            Point a=new Point(x,y);
            double c=sc.nextDouble();
            double d=sc.nextDouble();
            Point b=new Point(c,d);
            System.out.printf("%.4f\n",a.distance(b));
        }
        
    }
}
