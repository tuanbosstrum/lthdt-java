package songuyen;

import java.util.Scanner;

public class bai73 {

	static int a[]=new int [100001];
	static int count(int a[], int l, int r, int x){
		if (l == r){
			if (a[l] == x) return 1;
			else return 0;
		} else {
			int m = (l+r)/2;
			return count(a, l, m, x) + count(a, m+1, r, x);
		}
	}
	public static void main(String[] agrs){
		Scanner tam=new Scanner(System.in);
		int n, x;
		n=tam.nextInt();
		for (int i = 0; i < n; i++){
			a[i]=tam.nextInt();
		}
		x=tam.nextInt();
		System.out.print( count(a, 0, n-1, x));
	}

}
