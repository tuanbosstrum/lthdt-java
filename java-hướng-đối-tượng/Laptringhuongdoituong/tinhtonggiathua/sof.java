package tinhtonggiathua;
import java.util.Scanner;

public class sof {
	public static void main(String[] agrs) {
		Scanner tam=new Scanner(System.in);
		System.out.println("nhap n");
		int n=tam.nextInt();
		for(int i=1;i<=n;i++) {System.out.println("f("  +i+  ")="    +fibonacy(i));}
	}
	public static int fibonacy(int n) {
		if(n<3) {return 1;}
		if(n>3) {return fibonacy(n-1)+fibonacy(n-2);}
		return n;
	}

}
