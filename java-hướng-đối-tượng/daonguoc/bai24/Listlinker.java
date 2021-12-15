package bai24;

import java.util.Scanner;

public class Listlinker {
	static Node createNode(int x){
	    Node temp = new Node();
	    temp.next = null;
	    temp.data = x; 
	    return temp;
	}

	void printList(Node l){
		Node p = l;
		while (p != null){
			System.out.print(p.data+ " ");
			p = p.next;
		}
	}

	static Node addElement(Node p, int x){
		Node temp = createNode(x);
		p.next = temp;
		return temp;
	}

	static Node getNode(Node l, int k){
		Node p = l;
		for (int i = 0; i < k; i++){
			p = p.next;
		}
		return p;
	}

 public static void main(String[] agrs){
	 Scanner tam=new Scanner(System.in);
		int n, x, k;
		n=tam.nextInt();
		x=tam.nextInt();
		Node l = createNode(x);
		Node p = l;
		for (int i = 1; i < n; i++){
			x=tam.nextInt();
			p = addElement(p, x);
		}
		k=tam.nextInt();
		p = getNode(l, k);
	System.out.print( p.data);
	}

}
