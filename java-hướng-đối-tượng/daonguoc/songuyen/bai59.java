package songuyen;

import java.util.Scanner;

public class bai59 {
	static boolean b[]=new boolean [11];
	static int x[]=new int [11];
	static void printArray(int a[], int n){
		for (int i = 1; i <= n; i++){
			System.out.print(a[i]);
		}
		System.out.print(" ");
	}
	static void dequy(int k, int n){
		for (int i = 1; i <= n; i++){
			if (b[i]){
				x[k] = i;
				if (k == n){
					printArray(x, n);
				} else {
					b[i] = false;
					dequy(k+1, n);
					b[i] = true;
				}
			}
		}
	}
	public static void main(String[] agrs){
		Scanner tam=new Scanner(System.in);
		int n;
		n=tam.nextInt();
		for (int i = 1; i <=n; i++){
			b[i] = true;
		}
		dequy(1, n);
	}

}
