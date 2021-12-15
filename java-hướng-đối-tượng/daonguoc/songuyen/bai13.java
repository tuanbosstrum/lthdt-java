package songuyen;

import java.util.Scanner;
import java.util.Stack;

public class bai13 {
	public static void main(String [] agrs){
		Scanner tam=new Scanner(System.in);
		String s;
		Stack<Character> st=new Stack<Character>();
		s=tam.nextLine();
		for (int i = 0; i < s.length(); i++){
			st.push(s.charAt(i));
		}
		while(!st.empty()){
		System.out.print(st.peek());
			st.pop();
		}
	}

}
