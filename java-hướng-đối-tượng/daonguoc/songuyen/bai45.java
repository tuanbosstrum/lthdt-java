package songuyen;

import java.util.Scanner;

public class bai45 {
	static void printArray(int a[], int n){
	    for (int i = 0; i < n; i++){
	    	System.out.print(a[i]+ " ");;
		}
		
	}
	static void shellSort(int a[], int n){
		int interval, i, j, temp;
		for(interval = n/2; interval > 0; interval /= 2){
			for(i = interval; i < n; i++){
				temp = a[i];
				for(j = i; j >= interval && a[j - interval] > temp; j -= interval){
					a[j] = a[j - interval];				
				}
				a[j] = temp;
			}
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
		shellSort(a, n);
		printArray(a, n);

	}

}
