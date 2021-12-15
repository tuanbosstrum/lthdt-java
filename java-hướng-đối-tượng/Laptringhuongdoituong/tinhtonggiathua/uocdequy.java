package tinhtonggiathua;
import java.util.Scanner;

public class uocdequy {
	public static void main(String[] agrs) {
		Scanner tam=new Scanner(System.in);
		System.out.println("nhap p:");
		int p=tam.nextInt();
		System.out.println("nhap q:");
		int q=tam.nextInt();
		System.out.println("UCLN CUA"  +p+    "va"   +q+   "la:"   +u(p,q));
	}
public static int u(int p, int q) {
	if(q*p==0) {return q+p;}
	if(q*p!=0) {return u(q,p%q);}
	return q;
}
}
