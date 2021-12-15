package songuyen;

import java.util.Scanner;

public class bai8 {
	static int a[] =new int [100001];
	public static void main(String[] agrs){Scanner tam=new Scanner(System.in);
	    int n;
	    n=tam.nextInt();
	    for (int i = 0; i < n; i++){
	        a[i]=tam.nextInt();
	    }
	    boolean kt = true;
	    if (n > 2){
	        for (int i = 2; i < n; i++){
	            if ((a[i] - a[i-1]) * (a[i-1] - a[i-2]) <= 0){
	                kt = false;
	            }
	        }
	    }
	    if (kt) System.out.print("YES");
	    else {
	    	System.out.print("NO");
	    }
	}

}
