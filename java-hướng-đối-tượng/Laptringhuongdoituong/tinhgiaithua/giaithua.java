package tinhgiaithua;
import java.util.Scanner;
public class giaithua {
	public static void main(String[ ] agrs) {
		Scanner tam=new Scanner(System.in);
		System.out.println("nhap n");
		int n=tam.nextInt();
		System.out.println("Giai thua cua " +n+ "la:" +gt(n));	
	}
	public static int gt(int n) {
	if(n==0) {
		return 1;}
	if(n>0) {
		return n*gt(n-1);}
	return n;
}
}
