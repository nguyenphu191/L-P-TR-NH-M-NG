
import java.util.Scanner;
class Point{
    private double x,y;
    
    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public static Point nextPoint(Scanner in){
        return new Point(in.nextDouble(),in.nextDouble());
    }
    public double distance(Point p){
        return Math.sqrt(Math.pow(this.x-p.x, 2)+Math.pow(this.y-p.y, 2));
    }
}
class Triangle{
    private Point a,b,c;

    public Triangle() {
    }

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public boolean valid(){
        double c1=a.distance(b);
        double c2=a.distance(c);
        double c3=b.distance(c);
        if(c1+c2<=c3||c1+c3<=c2||c2+c3<=c1){
            return false;
        }
        return true;
    }
    public String getPerimeter(){
        double c1=a.distance(b);
        double c2=a.distance(c);
        double c3=b.distance(c);
        return String.format("%.03f", c1+c2+c3);
    }
}

public class J04019_LOP_TRIANGLE_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if(!a.valid()){
                System.out.println("INVALID");
            } else{
                System.out.println(a.getPerimeter());
            }
        }
    }
}
