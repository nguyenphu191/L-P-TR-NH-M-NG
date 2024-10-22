
import java.util.Scanner;


public class J02007_DEM_SO_LAN_XUAT_HIEN {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        for(int ii=1;ii<=t;ii++){
            int n=sc.nextInt();
            int[] a=new int[n];
            int[] dem=new int[10005];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                dem[a[i]]++;
            }
            System.out.printf("Test %d:\n",ii);
            for(int i=0;i<n;i++){
                if(dem[a[i]]>0){
                    System.out.printf("%d xuat hien %d lan\n",a[i],dem[a[i]]);
                    dem[a[i]]=0;
                }
            }
        }
    }
}
