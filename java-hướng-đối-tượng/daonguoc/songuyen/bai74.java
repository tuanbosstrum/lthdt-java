package songuyen;

import java.util.Scanner;

public class bai74 {
	static int a[]=new int [100001];
	static int l[]=new int [100001];
	static void printArray(int a[], int l, int r){
		for (int i = l; i <=r; i++){
			System.out.print(a[i]+ " ");
		}
	}
	public static void main(String [] agrs){
		Scanner tam=new Scanner(System.in);
		int n, x;
		n=tam.nextInt();
		for (int i = 0; i < n; i++){
			a[i]=tam.nextInt();
		}
		l[0] = 1;
		for (int i = 1; i < n; i++){
			if (a[i] >= a[i-1]){
				l[i] = l[i-1] + 1;
			} else {
				l[i] = 1;
			}
		}
		int csMax = 0;
		for (int i = 0; i < n; i++){
			if (l[csMax] < l[i]){
				csMax = i;
			}
		}
		printArray(a, csMax - l[csMax] + 1, csMax);
		
	}

}
