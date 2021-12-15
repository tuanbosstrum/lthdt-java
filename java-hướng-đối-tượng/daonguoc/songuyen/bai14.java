package songuyen;

import java.util.Scanner;
import java.util.Stack;

public class bai14 {
	public static void main(String[] agrs){
		Scanner tam=new Scanner (System.in);
		Stack<Character> st=new Stack<Character>();
		int n;
		n=tam.nextInt();
	    while(n > 0){
			st.push((char) (n%2+'0'));
			n /= 2;
		}
		while(!st.empty()){
			System.out.print(st.peek());
			st.pop();
		}
	}
}
