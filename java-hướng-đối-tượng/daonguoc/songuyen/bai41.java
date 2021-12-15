package songuyen;

import java.util.Scanner;

public class bai41 {
	static void printArray(int a[], int n){
		for (int i = 0; i < n; i++){
			System.out.print(a[i]+ " ");
		}
	}
	static void bubbleSort(int a[], int n){
		boolean swapper = true;
		for (int i = n-1; i >= 1; i--){
			for (int j = 0; j < i; j++){
				if (a[j] > a[j+1]){
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					swapper = false;
				}
			}
			if (swapper){
				break;
			}
		}
	} 
	static int a[]=new int [100001];
	public static void  main(String [] agrs){
		Scanner tam=new Scanner(System.in);
		int n = tam.nextInt();
		for (int i = 0; i < n; i++){
			a[i]=tam.nextInt();
		}
		bubbleSort(a, n);
		printArray(a, n);
		
		
	}
}
