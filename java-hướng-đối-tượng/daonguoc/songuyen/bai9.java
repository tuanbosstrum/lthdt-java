package songuyen;

import java.util.Scanner;

public class bai9 {
	static int a[]=new int [100001];
	static int b[]=new int [100001];
	static int c[]=new int [100001];
	public static void  main(String [] agrs){Scanner tam=new Scanner(System.in);
	    int n, m;
	    n=tam.nextInt();
	    for (int i = 0; i < n; i++){
	        a[i]=tam.nextInt();
	    }
	    m=tam.nextInt();
	    for (int i = 0; i < m; i++){
	        b[i]=tam.nextInt();
	    }
	    int size = 0; // lưu số lượng phần tử của dãy c
	    int i = 0, j = 0;
	    while (i < n && j < m){
	        if (a[i] < b[j]){
	            c[size] = a[i];
	            size = size + 1;
	            i = i + 1;
	        } else {
	            c[size] = b[j];
	            size = size + 1;
	            j = j + 1;
	        }
	    }
	    while (i < n){
	        c[size] = a[i];
	        size = size + 1;
	        i = i + 1;
	    }
	    while (j < m){
	        c[size] = b[j];
	        size = size + 1;
	        j = j + 1;
	    }
	    for (int i1 = 0; i1 < size; i1++){
	        System.out.print( c[i1]+ " ");
	    }
	 
	}

}
