package songuyen;

import java.util.Scanner;

public class bai52 {
	static long giaiThua(int n){
		if (n == 0) return 1;
		return n * giaiThua(n-1);
	}
	public static void main(String[] agrs){Scanner tam=new Scanner(System.in);
		int n;
		n=tam.nextInt();
		System.out.print(giaiThua(n));;
		
	}

}
