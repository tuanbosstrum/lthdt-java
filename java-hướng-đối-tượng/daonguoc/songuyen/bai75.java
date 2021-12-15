package songuyen;

import java.util.Scanner;

public class bai75 {
	static int a[]=new int [100001];
	static int l[]=new int [100001];
	static int moneyChange(int a[], int n, int x)
	{
	    for (int i = 0; i <= x; i++)
	        l[i] = 0;
	    for (int i = 0; i < n; i++)
	        l[a[i]] = 1;
		for (int i = 1; i <= x; i++)
		    for (int j = 0; j < n; j++)
		        if (i >= a[j]){
	                if ((l[i] > l[i-a[j]] + 1 && l[i-a[j]] != 0) || (l[i] == 0 && l[i-a[j]] != 0)){ 
	                    l[i] = l[i-a[j]] + 1;
	                }
		        }
		return l[x];
	}
	public static void main(String [] agrs){
		Scanner tam=new Scanner(System.in);
		int n, x;
		n=tam.nextInt();
		for (int i = 0; i < n; i++){
			a[i]=tam.nextInt();
		}
		x=tam.nextInt();
		 System.out.print(moneyChange(a, n, x));
		
	}
}
