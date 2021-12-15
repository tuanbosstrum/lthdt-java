package songuyen;

import java.util.Scanner;

public class bai5 {
	public static void main(String[] agrs){
		int a[]=new int[100];
		int n, k;
		Scanner tam=new Scanner(System.in);
		n=tam.nextInt();
		for (int i = 0; i < n; i++){
			a[i]=tam.nextInt();
		}
		k=tam.nextInt();
		for (int i = k; i < n; i++){
			a[i] = a[i+1];
		}
		n--;
		for (int i = 0; i < n; i++){
			System.out.print(a[i] + " ");;
		}
		
	
	}

}
