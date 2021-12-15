package songuyen;

import java.util.Scanner;

public class bai33 {
	static int Min(int a[], int n){
		int k = 0;
		for (int i = 1; i < n; i++){
			if (a[k] > a[i]){
				k = i;
			}
		}
		return k;
	}
	static int Max(int a[], int n){
		int k = 0;
		for (int i = 1; i < n; i++){
			if (a[k] <= a[i]){
				k = i;
			}
		}
		return k;
	}
	private static void prinArray(int a[], int n) {
		for(int i=0; i<n;i++) {
			System.out.print(a[i]+ " ");
		}
		
	}
	static int a[]	=new int[100001];

	public static void main(String[] agrs){
		int x;
		int n;
		Scanner tam=new Scanner(System.in);
		n=tam.nextInt();
		for (int i = 0; i < n; i++){
			 a[i]=tam.nextInt();
		}
		int csMin = Min(a, n);
		int csMax = Max(a, n);
		int temp=a[csMin];
		a[csMin]=a[csMax];
		a[csMax]=temp;
		prinArray(a, n);
		
	}
}
