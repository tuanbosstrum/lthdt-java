package songuyen;

import java.util.Scanner;

public class bai78 {
	static int a[]=new int [10001];
	static int b[]=new int [10001];
	static int t[]=new int [10001];
	static int kq[]=new int[10001];
	public static void main(String [] agrs){
		Scanner tam=new Scanner(System.in);
	    int n;
	   	n=tam.nextInt();
	    for (int i = 0; i < n; i++){
	        a[i]=tam.nextInt();
	    }
	    for (int i = 0; i < n; i++){
	        b[i] = 1;
	    }
	    for (int i = 1; i < n; i++){
	        for (int j = 0; j < i; j++){
	            if (a[i] >= a[j] && b[j] + 1 > b[i]){
	                b[i] = b[j] + 1;
	                t[i] = j;
	            }
	        }
	    }
	    int csMax = 0;
	    for (int i = 1; i < n; i++){
	        if (b[csMax] < b[i]){
	            csMax = i;
	        }
	    }
	    int k = b[csMax];
	    for (int i = k-1; i >= 0; i--){
	        kq[i] = a[csMax];
	        csMax = t[csMax];
	    }
	    for (int i = 0; i < k; i++){
	        System.out.print(kq[i]+  " ");
	    }
	}
}
