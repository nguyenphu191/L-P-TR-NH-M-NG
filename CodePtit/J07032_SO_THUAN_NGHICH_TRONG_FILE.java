import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class J07032_SO_THUAN_NGHICH_TRONG_FILE {
    private static final int N=(int) 1e6;
    public static boolean check(String s){
        if(s.length()%2==0||s.length()<=1){
            return false;
        }
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)-'0')%2==0){
                return false;
            }
        }
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException,IOException, ClassNotFoundException{
        ObjectInputStream os1=new ObjectInputStream(new FileInputStream("DATA1.in")); 
        ObjectInputStream os2=new ObjectInputStream(new FileInputStream("DATA2.in"));
        List<Integer> list1=(ArrayList<Integer>) os1.readObject();
        List<Integer> list2=(ArrayList<Integer>) os2.readObject();
        int d[]=new int[N];
        for(Integer x: list1){
            if(check(x.toString())&&list2.contains(x)){
                d[x]++;
            }
        }
        for(Integer x: list2){
            if(check(x.toString())&&d[x]>0){
                d[x]++;
            }
        }
        int k=0;
        for(int i=0;i<=N;i++){
            if(d[i]>0){
                System.out.println(i+" "+d[i]);
                k++;
                if(k==10){
                    break;
                }
            }
        }
    }
}
