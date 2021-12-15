package songuyen;

import java.util.Scanner;

public class bai46 {
	static void printArray(int a[], int n){
	    for (int i = 0; i < n; i++){
	    	System.out.print(a[i]+ " ");;
		}

	}
	static void quickSort(int a[], int l, int r){
		int p = a[(l+r)/2];
		int i = l, j = r;
		while (i < j){
			while (a[i] < p){
				i++;
			}
			while (a[j] > p){
				j--;
			}
			if (i <= j){
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}
		}
		if (i < r){
			quickSort(a, i, r);
		}
		if (l < j){
			quickSort(a, l, j);
		}
	}
	static int a[]=new int [100001];
	public static void  main(String [] agrs)
	{
		Scanner tam=new Scanner(System.in);
		int n;
		n=tam.nextInt();
		for(int i = 0; i < n; i++){
			a[i]=tam.nextInt();		
		}
		quickSort(a, 0, n-1);
		printArray(a, n);
	
	}
}
