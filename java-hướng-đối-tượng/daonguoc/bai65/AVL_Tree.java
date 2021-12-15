package bai65;

import java.util.Scanner;

public class AVL_Tree {
	static Node insert(Node t, int x){
		if (t == null){
			Node temp = new Node(x);
			temp.key =x;
			temp.left=null;
			temp.right=null;
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
	static int treeLevel(Node t){
		if (t == null) return -1;
		return 1 + Math.max(treeLevel(t.left), treeLevel(t.right));
	}
	static boolean checkAvl(Node t){
		if (t == null) 	return true;
		if (Math.abs(treeLevel(t.left) - treeLevel(t.right)) > 1) return false;
		return checkAvl(t.left) && checkAvl(t.right);
	}
	
	public static void main(String [] agrs){
		Scanner tam=new Scanner(System.in);
		int n, temp;
		n=tam.nextInt();
		Node t=null;
		for (int i = 0; i < n; i++){
			temp=tam.nextInt();
			t = insert(t, temp);
		}
	System.out.print(checkAvl(t));
	}

}
