package songuyen;

import java.util.Scanner;

public class bai54 {
	static int ucln(int a, int b){
	    if (b == 0) return a;
	    if (a % b == 0) return b;
	    return ucln(b, a%b);
	}

	public static void main(String [] agrs){
		Scanner tam=new Scanner(System.in);
	    int a, b;
	    a=tam.nextInt();
	    b=tam.nextInt();
	    System.out.print(ucln(a, b));
	}

}
