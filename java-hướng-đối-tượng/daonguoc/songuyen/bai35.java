package songuyen;

import java.util.Scanner;

public class bai35 {
	static int a[] =new int [100001];
	public static void main(String [] agrs){
	    int n;
	   //System.out.println("nhap phan tu mang:");
	   Scanner tam=new Scanner(System.in);
	   n=tam.nextInt();
	    for (int i = 0; i < n; i++){
	        a[i]=tam.nextInt();
	    }
	    boolean kt = true;
	    for (int i = 0; i < n; i++){
	        if (i % 2 == 0 && a[i] % 2 == 1){
	            System.out.print(a[i]+  " ");
	            kt = false;
	        }
	    }
	  
	    if (kt) System.out.println( "NULL");
	}
}
