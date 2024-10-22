
import java.util.Arrays;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class J07015_SO_NGUYEN_TO_TRONG_FILE_NHI_PHAN {
    public static int[] prime=new int[10000];
    public static void khoitao(){
        Arrays.fill(prime, 1);
        prime[0]=prime[1]=0;
        for(int i=2;i<=100;i++){
            if(prime[i]==1){
                for(int j=i*i;j<10000;j+=i){
                    prime[j]=0;
                }
            }
        }
    }
    public static void main(String[] args) throws FileNotFoundException,IOException, ClassNotFoundException{
        khoitao();
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> list=(ArrayList<Integer>) ois.readObject();
        int[] d=new int[10000];
        for(Integer x : list){
            d[x]+=prime[x];
        }
        for(int i=2;i<10000;i++){
            if(d[i]>0){
                System.out.println(i+" "+d[i]);
            }
        }
    }
}
