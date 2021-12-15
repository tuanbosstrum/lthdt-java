package songuyen;

import java.util.Scanner;

public class bai43 {
	static void printArray(int a[], int n){
		for (int i = 0; i < n; i++){
			System.out.print(a[i]+ " "); 
		}
	}
	static void selectionSort(int a[], int n){
		int indexMin;
		for (int i = 0; i < n-1; i++){
			indexMin = i;
			for (int j = i+1; j < n; j++){
				if (a[indexMin] > a[j]){
					indexMin = j;
				}
			}
			if (i != indexMin){
				int temp = a[i];
				a[i] = a[indexMin];
				a[indexMin] = temp;
			}
		}
	} 
	static int a []=new int [100001];
	public static void  main(String [] agrs){
		Scanner tam=new Scanner(System.in);
		int n;
		n=tam.nextInt();
		for (int i = 0; i < n; i++){
			a[i]=tam.nextInt();
		}
		selectionSort(a, n);
		printArray(a, n);
		
	
	}
}
