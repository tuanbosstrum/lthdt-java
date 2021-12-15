package songuyen;

import java.util.Scanner;

public class bai60 {
	static int x[]=new int [11];
	static void printArray(int a[], int n){
		for (int i = 1; i <= n; i++){
			System.out.print(a[i]);
		}
		System.out.print(" ");
	}
	static void dequy(int h, int k, int n){
		for (int i = x[h-1] + 1; i <= n - (k-h); i++){
			x[h] = i;
			if (h == k) printArray(x, k);
			else {
				dequy(h+1, k, n);
			}
		}
	}
	public static void  main(String [] agrs){
		Scanner tam=new Scanner(System.in);
		int n, k;
		n=tam.nextInt();
		k=tam.nextInt();
		x[0] = 0;
		dequy(1, k, n);
	}

}
