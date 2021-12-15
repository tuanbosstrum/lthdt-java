package songuyen;

import java.util.Scanner;

public class bai72 {
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
	static int solve(int a[], int n){
		int k = 1;
		quickSort(a, 0, n-1);
		int stiffness = a[n-1];
		for (int i = n-2; i >=0; i--){
			k = k + 1;
			stiffness = stiffness - 1;
			if (stiffness > a[i]){
				stiffness = a[i];
			}
			if (stiffness == 0) return k;
		}
		return n;
	}
	static int a[]=new int [100001];
	public static void main(String [] agrs){
		Scanner tam=new Scanner(System.in);
		int n;
		n=tam.nextInt();
		for (int i = 0; i < n; i++){
			a[i]=tam.nextInt();
		}
		System.out.print(solve(a, n));;
	}
}
