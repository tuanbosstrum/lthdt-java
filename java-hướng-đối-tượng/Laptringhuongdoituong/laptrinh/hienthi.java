package laptrinh;
import java.util.Scanner;

public class hienthi {
	public static void main(String agrs[]) {
		Scanner tam=new Scanner(System.in);
		int a,n;
		System.out.println("nhap n:");
		n=tam.nextInt();
		System.out.println("");
		a=n;
		for(int r=1;r<=n;r++) {
			for(int b=1;b<=n;b++) {
				System.out.println();
			}
			for(int c=1;c<=n;c++);{
				System.out.println("*");
			}
			for(int c=a-r;r>=n;r--);{ 
				System.out.println("*");
				n--;
			}
			System.out.println();
			
			
		}
	}
}

