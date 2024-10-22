
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

import java.util.Set;
class WordSet {
    private Set<String> set;
    private ArrayList<String> list;
    public WordSet(String name) throws FileNotFoundException{
        Scanner sc=new Scanner(new File("VANBAN.in"));
//        set=new TreeSet<>();
        set=new HashSet<>();
        while(sc.hasNext()){
            set.add(sc.next().toLowerCase());
        } 
        list=new ArrayList<>(set);
        Collections.sort(list);
    }

    @Override
    public String toString() {
        String res="";
        for(String x:list){
            res+=x+"\n";
        }
        return res;
    }
    
}
public class J07007_LIET_KE_TU_KHAC_NHAU {
    
    public static void main(String[] args) throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
        
    }
}
