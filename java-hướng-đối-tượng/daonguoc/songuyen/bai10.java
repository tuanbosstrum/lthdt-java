package songuyen;

import java.util.Scanner;

public class bai10 {
	public static void main(String [] agrs){
		int[][] a =new int[100][100];
		int m, n;
		Scanner tam=new Scanner(System.in);
		n=tam.nextInt();
		m=tam.nextInt();
		for (int i = 0; i < m; i++){
			for (int j = 0; j < n; j++){
				a[i][j]=tam.nextInt();
			}
		}
		int sum = 0;
		for (int i = 0; i < m; i++){
			for (int j = 0; j < n; j++){
				sum += a[i][j];
			}
		}
		System.out.print(sum);
		
		
	}

}
