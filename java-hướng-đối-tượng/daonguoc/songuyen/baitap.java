package songuyen;

import java.util.Scanner;

public class baitap {
	static int search(int a[], int n, int x){
		for (int i = 0; i < n; i++){
			if (a[i] == x){
				return i;
			}
		}
		return -1;
	}

	static int a[] = new int[10001];

	public static void main(String[] agrs) {
		int n, x;
		Scanner tam = new Scanner(System.in);
		n = tam.nextInt();
		for (int i = 0; i < n; i++) {
			a[i] = tam.nextInt();
		}
		x = tam.nextInt();
		System.out.println(search(a, n, x));
	}
}
