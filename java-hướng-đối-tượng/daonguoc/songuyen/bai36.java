package songuyen;

import java.util.Scanner;

public class bai36 {
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

	static int a[] = new int [100001];
	public static void main(String[] agrs){
		int n, x;
		Scanner tam=new Scanner(System.in);
        //System.out.println("nhap phan tu mang:");
		n=tam.nextInt();
		for (int i = 0; i < n; i++){
			a[i]=tam.nextInt();
		}
		//System.out.println("nhap phan tu x:");
		 x=tam.nextInt();
		System.out.print(BinSearch(a, n, x));
		
	}

}
