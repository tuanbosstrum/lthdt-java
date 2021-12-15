package songuyen;

import java.util.Scanner;

public class bai53 {
	static long  dequy(int a, int b){
	    if (b == 0) return 1;
	    return a * dequy(a, b-1);
	}
	public static void main(String[] agrs){
		Scanner tam=new Scanner(System.in);
	    int a, b;
	    a=tam.nextInt();
	    b=tam.nextInt();
	    System.out.print(dequy(a, b));
	}

}
