package songuyen;

import java.util.Scanner;

public class bai56 {
	static int gameGuessNumber(long n)
	{
	    if (n==1) return 1;
		return 1 + gameGuessNumber(n-(n+1)/2);
	}
	public static void main(String [] agrs){
		Scanner tam=new Scanner(System.in);
		long n;
		n=tam.nextLong();
		System.out.print(gameGuessNumber(n));;
	
	}

}
