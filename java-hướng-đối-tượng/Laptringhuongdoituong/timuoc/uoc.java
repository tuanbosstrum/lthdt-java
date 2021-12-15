package timuoc;
import java.util.Scanner;
public class uoc {
	public static void main(String[] agrs) {
		Scanner tam=new Scanner(System.in);
		System.out.println("nhap p:");
		int p=tam.nextInt();
		System.out.println("nhap q:");
		int q=tam.nextInt();
		System.out.println("UCLN cua p:"+p+ "va" +q+ "la:" +u( p,q));
	}

	public static int u(int p, int q) {
		if(q*p==0) {return q+p;}
		if(q*p!=0) {return u(q,p%q);}
		return q ;
	}

}
