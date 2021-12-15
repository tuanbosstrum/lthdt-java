package songuyen;

import java.util.Scanner;

public class bai42 {
	static void printArray(int a[], int n){
		for (int i = 0; i < n; i++){
			System.out.print(a[i]+ " "); 
		}
	}
	static void insertionSort(int a[], int n){
		int index, value;
		for (int i = 1; i < n; i++){
			index = i;
			value = a[i];
			while (index > 0 && a[index - 1] > value){
				a[index] = a[index - 1];
				index --;
			}
			a[index] = value;
		}
	} 
	static int a[] =new int [100001];
	public static void main(String [] agrs){
		int n;
		Scanner tam=new Scanner(System.in);
		 n=tam.nextInt();
		for (int i = 0; i < n; i++){
			a[i]=tam.nextInt();
		}
		insertionSort(a, n);
		printArray(a, n);
		
		
	}
}	
