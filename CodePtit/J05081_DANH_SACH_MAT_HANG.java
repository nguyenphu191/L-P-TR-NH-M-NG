
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
class Product{
    private String ma,name,dvi;
    private int gmua,gban;

    public Product() {
    }

    public Product(String ma, String name, String dvi, int gmua, int gban) {
        this.ma = ma;
        this.name = name;
        this.dvi = dvi;
        this.gmua = gmua;
        this.gban = gban;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDvi() {
        return dvi;
    }

    public void setDvi(String dvi) {
        this.dvi = dvi;
    }

    public int getGmua() {
        return gmua;
    }

    public void setGmua(int gmua) {
        this.gmua = gmua;
    }

    public int getGban() {
        return gban;
    }

    public void setGban(int gban) {
        this.gban = gban;
    }
    
    public int lai(){
        return gban-gmua;
    }
    @Override
    public String toString() {
        return ma+" "+name+" "+dvi+" "+gmua+" "+gban+" "+lai();
    }   
}

public class J05081_DANH_SACH_MAT_HANG {
    public static Scanner sc =new Scanner (System.in);
    public static void main(String[] args) {
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<Product> arr=new ArrayList<>();
        for(int i=1;i<=t;i++){
            String name=sc.nextLine();
            String dvi=sc.nextLine();
            int gmua=Integer.parseInt(sc.nextLine());
            int gban=Integer.parseInt(sc.nextLine());
            String ma=""+i;
            while(ma.length()<3){
                ma="0"+ma;
            }
            ma="MH"+ma;
            Product sp=new Product(ma,name,dvi,gmua,gban);
            arr.add(sp);
        }
        Collections.sort(arr,new Comparator<Product>(){
            @Override
            public int compare(Product a,Product b){
                if(a.lai()<b.lai()){
                    return 1;
                }else if(a.lai()==b.lai()){
                    return 0;
                }else{
                    return -1;
                }
            }
        });
        for(Product x: arr){
            System.out.println(x);
        }
    }
}
