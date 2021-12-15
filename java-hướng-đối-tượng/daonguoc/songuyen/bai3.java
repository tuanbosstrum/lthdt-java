package songuyen;

import java.util.Scanner;

public class bai3 {
	public static void main(String [] agrs){
		int a[] =new int [100];
		int n;
		Scanner tam=new Scanner(System.in);
		 n=tam.nextInt();
		
		for (int i = 0; i < n; i++){
			 a[i]=tam.nextInt();
		}
		for (int i = 0; i < n; i++){
			a[i] = a[i]*a[i];
		}
		for (int i = 0; i < n; i++){
			System.out.print(a[i]+ " ");;
		}
		
	}

}
