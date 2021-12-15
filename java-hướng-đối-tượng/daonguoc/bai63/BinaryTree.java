package bai63;

import java.util.Scanner;

public class BinaryTree {
	static Node insert(Node t, int x){
		if (t == null){
			Node temp=new Node(x);
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
	static boolean isLeafNode(Node l){
		return (l.left == null && l.right == null);
	}
	static int countLeafNode(Node t){
		if (t == null) return 0;
		if (isLeafNode(t)) return 1;
		return countLeafNode(t.left) + countLeafNode(t.right);
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
		System.out.print(countLeafNode(t));
	}
}
