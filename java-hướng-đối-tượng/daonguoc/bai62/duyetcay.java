package bai62;

import java.util.Scanner;

public class duyetcay {
	static Node insert(Node t, int x){
		if (t == null){
			Node temp = new Node(x);
			temp.key =x;
			temp.left = null;
			temp.right = null;
			return temp;
		} else{
			if (x < t.key){
				t.left = insert(t.left, x);
			} 
			else{
				t.right = insert(t.right, x);
			}
		}
		return t;	
	}
	static void printTree(Node t){
		if (t != null){
			printTree(t.left);
			System.out.print(t.key+  " " );;
			printTree(t.right);
		}
	}
	public static void main(String [] agrs){
		Scanner tam=new Scanner(System.in);
		int n, x;
		n=tam.nextInt();
		Node t=null;
		for (int i = 0; i < n; i++){
			x=tam.nextInt();
			t = insert(t, x);
		}
		printTree(t);
	}

}
