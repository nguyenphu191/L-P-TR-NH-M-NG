
import java.util.Scanner;
class ThiSinh{
    private String name;
    private String date;
    private double d1,d2,d3;
    public ThiSinh() {
    }

    public ThiSinh(String name, String date, double d1, double d2, double d3) {
        this.name = name;
        this.date = date;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }   
    @Override
    public String toString() {
        return name +" "+ date+" " +String.format("%.1f", d1+d2+d3) ;
    }
    
}

public class J04005_KHAI_BAO_LOP_THI_SINH {
    public static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) {
        String name=sc.nextLine();
        String date=sc.nextLine();
        double x=sc.nextDouble();
        double y=sc.nextDouble();
        double z=sc.nextDouble();
        ThiSinh ts=new ThiSinh(name,date,x,y,z);
        System.out.println(ts);
    }
}
//Nguyen Hoang Ha
//11/10/2001
//4.5
//10.0
//5.5