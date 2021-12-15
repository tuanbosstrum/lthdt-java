package cau1;

import java.util.Scanner;

public class cau1 {
	static void printArray(int a[], int n) {
		for (int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}
	static int max(int a[], int n)
	{
	    int max = a[0];
	    for (int i = 1; i < n; i++)
	        if (max < a[i])
	            max = a[i];
	    return max;
	}
	 
	 
	static int min(int a[], int n)
	{
	    int min = a[0];
	    for (int i = 1; i < n; i++)
	        if (min > a[i])
	            min = a[i];
	    return min;
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
	static int a[]=new int[1000001];
	public static void main(String args[]){
		int n;
		Scanner tam=new Scanner(System.in);
		n=tam.nextInt();
		for (int i = 0; i < n; i++){
			a[i]=tam.nextInt();
		}
		bubbleSort(a, n);
		printArray(a, n);
		System.out.println();
		System.out.print(" Số nhỏ nhất:"+min(a, n));				
		System.out.println();
		System.out.print(" Số lớn nhất:"+max(a, n));
	}
}
