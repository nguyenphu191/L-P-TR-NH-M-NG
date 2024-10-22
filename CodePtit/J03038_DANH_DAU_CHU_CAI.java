
import java.util.HashSet;
import java.util.Scanner;


public class J03038_DANH_DAU_CHU_CAI {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        String s=sc.next();
        for(int i=0;i<s.length();i++){
            set.add(""+s.charAt(i));
        }
        System.out.println(set.size());
    }
}
