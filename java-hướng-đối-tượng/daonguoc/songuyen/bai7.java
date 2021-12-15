package songuyen;

import java.util.Scanner;

public class bai7 {
	static int a[]=new int [100001];
	static int b[]=new int [100001];
	public static void main(String [] agrs){
		Scanner tam=new Scanner(System.in);
	    int n;
	   n=tam.nextInt();
	    for (int i = 0; i < n; i++){
	        a[i]=tam.nextInt();
	    }
	    int Max = a[0];
	    for (int i = 0; i < n; i++){
	        if (a[i] > Max){
	            Max = a[i];
	        }
	    }
	    for (int i = 0; i <= Max; i++){
	        b[i] = 0;
	    }
	    for (int i = 0; i < n; i++){
	        b[a[i]] += 1;
	    }
	    for (int i = 0; i <= Max; i++){
	        if (b[i] > 0){
	            System.out.print(i+" - "+ b[i]+ "; ");;
	        }
	    }
	}

}
