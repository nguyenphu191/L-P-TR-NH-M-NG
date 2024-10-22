
import java.util.Scanner;

public class J01000_HCN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int r = sc.nextInt();
		int a,b;
		if(d<=0||r<=0) {
			System.out.println('0');
		}else {
			a= (d+r)*2;
			b=d*r;
			System.out.println(a+" "+b);
		}
    }
}
