package bai21;

import java.util.Scanner;

public class Listlinker {
	static Node createNode(int x ){
	    Node temp = new Node();
	    temp.next=null;
	    temp.data=x; 
	    return temp;
	}

	static void printList(Node l){
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

	public static void main(String[] agrs){
		int n, x;
		Scanner tam=new Scanner(System.in);
		n=tam.nextInt();
		x=tam.nextInt();
		Node l = createNode(x);
		Node p = l;
		for (int i = 1; i < n; i++){
			x=tam.nextInt();
			p = addElement(p, x);
		}
		printList(l);
	}
}
