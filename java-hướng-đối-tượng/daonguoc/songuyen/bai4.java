package songuyen;

import java.util.Scanner;

public class bai4 {
	public static void main(String[] agrs){
		int a[]=new int [100];
		int n, k, x;
		Scanner tam=new Scanner(System.in);
		n=tam.nextInt();
		for (int i = 0; i < n; i++){
			 a[i]=tam.nextInt();
		}
	 k=tam.nextInt();
	 x=tam.nextInt();
		for (int i = n; i >= k+1; i--){
			a[i] = a[i-1];
		}
		a[k] = x;
		n++;
		for (int i = 0; i < n; i++){
			System.out.print(a[i]+ " ");;
		}
	}
}
