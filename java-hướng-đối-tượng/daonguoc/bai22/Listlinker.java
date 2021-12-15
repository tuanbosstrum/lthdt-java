package bai22;

import java.util.Scanner;

public class Listlinker {
	static Node createNode(int x){
	    Node temp = new Node();
	    temp.next=null;
	    temp.data=x; 
	    return temp;
	}

	static void printList(Node l){
		Node p = l;
		while (p != null){
			System.out.print(p.data+  " ");
			p = p.next;
		}
	}

	static Node addElement(Node p, int x){
		Node temp = createNode(x);
		p.next = temp;
		return temp;
	}

	static Node addHead(Node l, int x){
		Node temp = new Node();
		temp.data = x;
		temp.next = l;
		l = temp;
		return l;
	}

	static Node addAt(Node l, int k, int x){
		Node p = l;
		for (int i = 0; i < k-1; i++){
			p = p.next;
		}
		Node temp = new Node();
		temp.data = x;
		temp.next = p.next;
		p.next = temp;
		
		return l;
	}

	static Node addTail(Node l, int x){
		Node p = l;
		while (p.next != null){
			p= p.next;
		}
		Node temp = new Node();
		temp.data = x;
		temp.next = null;
		p.next = temp;
		return l;
	}

	public static void  main(String[] agrs){
		int n, x, k;
		Scanner tam=new Scanner(System.in);
		n=tam.nextInt();
		x=tam.nextInt();
		Node l = createNode(x);
		Node p = l;
		for (int i = 1; i < n; i++){
			x=tam.nextInt();
			p = addElement(p, x);
		}
		k=tam.nextInt();
		x=tam.nextInt();
		if (k == 0){
			l = addHead(l, x);	
		} else if (k == n){
			l = addTail(l, x);
		} else{
			l = addAt(l, k, x);
		}
		printList(l);
	}
}
