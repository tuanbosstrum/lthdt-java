package bai67;

import java.util.Scanner;

public class Tree {
	static Node insert(Node t, int x){
		if (t == null){
			Node temp = new Node(x);
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
	static Node turnRight(Node a){
		Node b = a.left;
		Node d = b.right;
		a.left = d;
		b.right = a;
		return b;
	}
	static Node turnLeft(Node a){
		Node b = a.right;
		Node c = b.left;
		a.right = c;
		b.left = a;
		return b;
	}
	void printTree(Node t){
		if (t != null){
			printTree(t.left);
			System.out.print(t.key+  " ");
			if (t.left != null) System.out.print(t.right.key+  " ");
			printTree(t.right);
		}
	}
	static Node updateTreeAvl(Node t){
		if (Math.abs(treeLevel(t.left) - treeLevel(t.right)) > 1){
			if (treeLevel(t.left) > treeLevel(t.right)){
				Node p = t.left;
				if (treeLevel(p.left) >= treeLevel(p.right)){
					t = turnRight(t);
				} else{
					t.left = turnLeft(t.left);
					t = turnRight(t);
				}
			} else {
				Node p = t.right;
				if (treeLevel(p.right) >= treeLevel(p.left)){
					t = turnLeft(t);
				} else{
					t.right = turnRight(t.right);
					t = turnLeft(t);
				
				}
			}	
		}
		if (t.left != null) t.left = updateTreeAvl(t.left);
		if (t.right != null) t.right = updateTreeAvl(t.right);
		return t;
	}
	static int count(Node t, int x){
		if (t == null) return 0;
		if (t.key == x) return 1 + count(t.left, x) + count(t.right, x);
		else if (t.key < x) return count(t.right, x);
		return count(t.left, x);
	}
	public static void main(String [] agrs){
		Scanner tam=new Scanner(System.in);
		int n, x, temp;
		n=tam.nextInt();
		Node t=null;
		for (int i = 0; i < n; i++){
			temp=tam.nextInt();
			t = insert(t, temp);
		}
		while(!checkAvl(t)){
			t = updateTreeAvl(t);		
		}
		x=tam.nextInt();
		System.out.print(count(t, x));
	}
}
