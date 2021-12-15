package bai68;

import java.util.Scanner;

public class Tree_Element_Delete {
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
			} else{
				t.right = insert(t.right, x);
			}
		}
		return t;
	}
	static void printTree(Node t){
		if (t != null){
			printTree(t.left);
			System.out.print(t.key+  " ");
			printTree(t.right);
		}
	}
	static void deleteNode(Node t){
		if(t != null){
			if (t.left != null) deleteNode(t.left);
			if (t.right != null) deleteNode(t.right);
			deleteNode(t);
		}
	}
	static Node deleteNumber(Node t, int x){
		if (t != null){
			if (t.key== x){
				deleteNode(t.left);
				deleteNode(t.right);
				t = null;
			}
			else if (t.key > x) t.left = deleteNumber(t.left, x);
			else t.right = deleteNumber(t.right, x);		
		}
		return t;
	}
	public static void main(String[] agrs){
		Scanner tam=new Scanner(System.in);
		int n, x, temp;
		n=tam.nextInt();
		Node t=null;
		for (int i = 0; i < n; i++){
			temp=tam.nextInt();
			t = insert(t, temp);
		}
		x=tam.nextInt();
		t = deleteNumber(t, x);
		if (t == null) System.out.println("null");
		else printTree(t);
	}
}
