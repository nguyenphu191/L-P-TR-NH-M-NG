import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class J07022_LOAI_BO_SO_NGUYEN {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc=new Scanner(new File("DATA.in"));
        ArrayList<String> list=new ArrayList<>();
        while(sc.hasNext()){
            String s=sc.next();
            try{
                int n=Integer.parseInt(s);
            }catch(NumberFormatException e){
                list.add(s);
            }
        }
        Collections.sort(list);
        for(String x:list){
            System.out.printf(x+" ");
        }
    }
}
