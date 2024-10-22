
import java.util.Scanner;

class Rectange{
    private double width;
    private double height;
    private String color;

    public Rectange() {
    }

    public Rectange(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return this.color.substring(0,1).toUpperCase()+this.color.substring(1).toLowerCase();
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double findArea(){
        return this.height*this.width;
    }
    public double findPerimeter(){
        return (this.height+this.width)*2;
    }
}

public class J04002_KHAI_BAO_LOP_HINH_CHU_NHAT {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        double x=sc.nextDouble();
        double y=sc.nextDouble();
        String cl=sc.next();
        if(x>0&&y>0){
            Rectange hcn=new Rectange(y,x,cl);
            System.out.printf("%d %d %s",(int)hcn.findPerimeter(),(int)hcn.findArea(),hcn.getColor());
        }else{
            System.out.printf("INVALID");
        }
    }
}
