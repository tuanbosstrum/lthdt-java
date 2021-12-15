package songuyen;

import java.util.Scanner;

public class bai6 {
	static boolean isPrime(int n){
		if (n < 2) return false;
		for (int i = 2; i <= Math.sqrt(n); i++){
			if (n%i == 0){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] agrs){
		int a[]=new int [100];
		Scanner tam=new Scanner(System.in);
		int n;
		n=tam.nextInt();
		for (int i = 0; i < n; i++){
			a[i]=tam.nextInt();
		}
		for (int i = 0; i < n; i++){
			if (isPrime(a[i])){
				System.out.print(a[i]+ " ");;	
			}
		}
	}
}
