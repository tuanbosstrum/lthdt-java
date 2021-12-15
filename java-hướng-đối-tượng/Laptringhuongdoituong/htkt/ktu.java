package htkt;
import java.util.Scanner;
public class ktu {
	public static void main (String[] agrs) {
		Scanner tam=new Scanner(System.in);
		int a,n;
		System.out.printf("nhap n:");
		a=tam.nextInt();
		System.out.println();
		n=a;
		for(int r=1;r<=a;r++) {
			for(int b=1;b<=r;b++) {System.out.println("");}
			for(int c=1;c<=n;c++) {System.out.println("*");}
			for(int c=a-r;c>=1;c--) {System.out.println("*");}
			n--;
			System.out.println();
			
		}
		
	}

}
