package songuyen;

import java.util.Scanner;

public class bai77 {
	static int l[][]=new int [1001][1001];
	static String longestChainSymmetry(String s)
	{
	    String x = s;
	    String y = "";
	    for (int i = s.length() - 1; i >= 0; i --) y = y + x.charAt(i);
	    int m = x.length(), n = y.length();
	    x = ' ' + x;
	    y = ' ' + y;
		for (int i = 0; i <= m; i++) l[i][0] = 0;
		for (int j = 0; j <= n; j++) l[0][j] = 0;
	    for (int i = 1; i <= m; i++) 
		for (int j = 1; j <= n; j++) {
	        if (x.charAt(i) == y.charAt(j)) l[i][j] = l[i-1][j-1] + 1;
	        else l[i][j] = Math.max(l[i-1][j], l[i][j-1]);
	    } 
	    String p = "";
	    while (l[m][n] > 0 && m > 0 && n > 0){
	    	while (l[m-1][n] == l[m][n]) m --;	 
			while (l[m][n] == l[m][n-1]) n --;	
			p = x.charAt(m) + p;
			m --;
			n --; 	
		}
	   return p;
	}
	public static void main(String [] agrs){
		Scanner tam=new Scanner(System.in);
	    String s;
	    s=tam.nextLine();
	    System.out.print(longestChainSymmetry(s));
	}
}
