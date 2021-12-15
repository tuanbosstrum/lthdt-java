package songuyen;

import java.util.Scanner;

public class bai51 {
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
	static void printArray(int a[], int n){
	    for (int i = 0; i < n; i++){
	    	System.out.print(a[i]+ " ");;
		}
	}
	static int a[]=new int [100001];
	static int b[]=new int [100001];
	public static void main(String[] agrs){
		Scanner tam=new Scanner(System.in);
	    int n;
	    n=tam.nextInt();
	    for (int i = 0; i < n; i++){
	       a[i]=tam.nextInt();
	    }
	    int k = 0;
	    for (int i = 0; i < n; i++){
	    	if (a[i] != 0){
	    		b[k] = a[i];  
				k = k + 1;  		
			}
		}
		quickSort(b, 0, k-1);
		k = 0;
		for (int i = n-1; i >= 0; i--){
			if (a[i] < 0){
				a[i] = b[k];
				k = k + 1;
			}
		}
		for (int i = 0; i < n; i++){
			if (a[i] > 0){
				a[i] = b[k];
				k = k + 1;
			}
		}
		printArray(a, n);
	}

}
