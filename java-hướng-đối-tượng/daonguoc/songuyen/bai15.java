package songuyen;

import java.util.Scanner;
import java.util.Stack;

public class bai15 {
	static String to_string(long n){
	    String s = "";
	    while (n > 0){
	        s = (char )(n%10 + '0') + s;
	        n /= 10;
	    }
	    return s;
	}
	

	public static void main(String [] agrs){
		Scanner tam=new Scanner(System.in);
		String s;
		s=tam.nextLine();
	 	s = s + '@';
		Stack<Character> st=new Stack<Character>();
	    String str = "";
	    for (int i = 0; i < s.length(); i++){
	        if (st.empty() || st.peek() == s.charAt(i)){
	            st.push(s.charAt(i));
	            
	        } else {
	            int count = 0;
	            str = str + st.peek();
	            while(!st.empty()){
	                count++;
	                st.pop();
	            }
	            
				str = str + to_string(count);
	            st.push(s.charAt(i));
	        }
	    }
	    System.out.print(str);
	}

}
