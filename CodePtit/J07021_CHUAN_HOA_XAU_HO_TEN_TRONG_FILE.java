
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class J07021_CHUAN_HOA_XAU_HO_TEN_TRONG_FILE {
    public static void main(String[] args) throws FileNotFoundException{
        File f=new File("DATA.in");
        Scanner sc=new Scanner(f);
        ArrayList<String> list=new ArrayList<>();
        while(sc.hasNextLine()){
            String s=sc.nextLine();
            if(s.equals("END")){
                break;
            }else{
                String res="";
                String[] name=s.trim().split("\\s+");
                for(String x:name){
                    res+=x.substring(0, 1).toUpperCase()+x.substring(1).toLowerCase()+" ";
//                    res+=x.substring(0, 1).toUpperCase();
//                    res+=(x.substring(1).toLowerCase()+" ");
                }
                list.add(res);
            }
        }
        for(String x:list){
            System.out.println(x);
        }
    }
}
