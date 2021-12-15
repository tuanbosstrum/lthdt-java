package tinhtonggiathua;
import java.util.Scanner;

public class tinhtongs {
	public static void main(String[] agrs) {
		Scanner tam=new Scanner(System.in);
		System.out.println("nhap n:");
		int n=tam.nextInt();
		System.out.println("tong la:"  +tong(n));
	}
public static int tong(int n) {
	if(n==1) {return 1;}
	if(n>1) {return tong(n-1)+(2*n+1);}
	return n;
}
}
