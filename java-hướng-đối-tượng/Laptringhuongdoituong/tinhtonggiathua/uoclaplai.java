package tinhtonggiathua;
import java.util.Scanner;

public class uoclaplai {
	public static void main(String[]agrs) {
		Scanner tam=new Scanner(System.in);
		System.out.println("nhap p:");
		int p=tam.nextInt();
		System.out.println("nhap q:");
		int q=tam.nextInt();
		System.out.println("UCLN cua"  +p+  "va"  +q+  "la:"     +u(p,q)	);
	}
	public static int u(int p, int q) {
		while(p*q!=0) {if(p>q) {p%=q;}
		else q%=p;
		}
		return p+q;
	}

}
