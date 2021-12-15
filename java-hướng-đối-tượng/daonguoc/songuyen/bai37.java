package songuyen;

import java.util.Scanner;

public class bai37 {
	static int a[] = new int[1000000];
	static int b[] = new int[1000000];
	static int BinSearch(int a[], int n, int x){
		int l = 0, r = n-1;
		while (l < r){
			int mid = (l+r)/2;
			if (a[mid] < x){
				l = mid+1;
			}
			else{
				r = mid;
			}
		}
		if (a[l] == x){
			return l;
		}
		return -1;
	}

	static void printArray(int a[], int n, int l, int r){
		for (int i = l; i <= r; i++){
			System.out.print(a[i]+" ");
		}
}
	static boolean solve(int a[], int b[], int n, int s){
		b[0] = a[0];
		for (int i = 1; i < n; i++){
			b[i] = b[i-1] + a[i];
		}
		for (int i = 0; i < n; i++){
			if (b[i] == s){
				printArray(a, n, 0, i);
				return true;
			}
			if (b[i] > s){
				int l = BinSearch(b, n, b[i]-s);
				if (l != -1){
					printArray(a, n, l+1, i);
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		
		int n, s;
		Scanner tam=new Scanner (System.in);
		n=tam.nextInt();
		for (int i = 0; i < n; i++){
			a[i]=tam.nextInt();
		}
		s=tam.nextInt();
		boolean k = solve(a, b, n, s);
		if (!k){
			System.out.print(-1);
		}	
	}
}


