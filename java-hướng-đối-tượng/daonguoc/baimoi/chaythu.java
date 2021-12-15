package baimoi;

import java.util.Scanner;

public class chaythu {
	static int solve(int n){
		if (n == 1) return 1;
		return solve(n/2) + solve(n - n/2);
	}
	public static void main(String[] agrs){
		Scanner tam=new Scanner(System.in);
		int n = tam.nextInt();
		System.out.print(solve(n));
	
	}

}
