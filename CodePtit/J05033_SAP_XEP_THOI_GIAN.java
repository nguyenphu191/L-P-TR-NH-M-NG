
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Time{
    private int gio,phut,giay;

    public Time() {
        gio=0; phut=0; giay=0;
    }

    public Time(int gio, int phut, int giay) {
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }
    public int stime(){
        return gio*3600+phut*60+giay;
    }
    @Override
    public String toString() {
        return gio + " " + phut + " " + giay ;
    }
}

public class J05033_SAP_XEP_THOI_GIAN {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Time> arr=new ArrayList<Time>();
        int t=sc.nextInt();
        while(t-->0){
            int h=sc.nextInt();
            int m=sc.nextInt();
            int s=sc.nextInt();
            Time tg=new Time(h,m,s);
            arr.add(tg);
        }
        Collections.sort(arr,new Comparator<Time>(){
            @Override
            public int compare(Time a, Time b){
                if(a.stime()>b.stime()){
                    return 1;
                }else if(a.stime()==b.stime()){
                    return 0;
                }else {
                    return -1;
                }
            }
        });
       
        for (Time x: arr){
            System.out.println(x);
        }
    }
    
}
