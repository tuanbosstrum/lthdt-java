package songuyen;

import java.util.Scanner;

public class bai58 {
	static void dequy(int n, String s){
		if (n == 0) System.out.print(s+ " ");
		else {
			for (int i = 0; i <= 1; i++){
				dequy(n-1, s + (char)(i + '0'));
			}
		}
	}
	public static void main(String[] agrs){
		Scanner tam=new Scanner(System.in);
		int n;
		n=tam.nextInt();
		dequy(n, "");
	}

}
