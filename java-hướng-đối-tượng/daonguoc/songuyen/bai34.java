package songuyen;

import java.util.Scanner;

public class bai34 {
	static int a[]=new  int[100001];
	public static void main(String[] agrs){
	    int n, x;
	    Scanner tam=new Scanner(System.in);
	   // System.out.println("nhap phan tu mang:");
	    n=tam.nextInt();
	    for (int i = 0; i < n; i++){
	        a[i]=tam.nextInt();
	    }
	    x=tam.nextInt();
	    int count = 0;
	    for (int i = 0; i < n; i++){
	        if (a[i] == x){
	            count ++;
	        }
	    }
	    System.out.println( count);
	}

}
