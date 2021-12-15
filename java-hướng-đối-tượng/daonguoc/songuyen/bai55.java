package songuyen;

import java.util.Scanner;

public class bai55 {
	static long fibonacci(int n){
		if (n == 1 || n == 2) return 1;
		return fibonacci(n-1) + fibonacci(n-2);
	}
	public static void main(String [] agrs){
		Scanner tam=new Scanner(System.in);
		int n;
		n=tam.nextInt();
		System.out.print(fibonacci(n));
		
	}
}
