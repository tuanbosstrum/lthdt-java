package bai23;

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
			System.out.print(p.data+ " ");;
			p = p.next;
		}
	}

	static Node addElement(Node p, int x){
		Node temp = createNode(x);
		p.next = temp;
		return temp;
	}

	static Node deleteHead(Node l){
		Node p = l;
		p = p.next;
		deleteHead(l);
		return p;
	}

	static Node deleteTail(Node l){
		Node p = l;
		while (p.next.next != null){
			p = p.next;
		}
		deleteHead(p.next);
		p.next = null;
		return l;
	}

	static Node deleteAt(Node l, int k){
		Node p = l;
		for (int i = 0; i < k-1; i++){
			p = p.next;
		}
		Node temp = p.next;
		p.next = p.next.next;
		deleteHead(temp);
		return l;
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
		if (k == 0){
			l = deleteHead(l);
		} else if (k == n-1){
			l = deleteTail(l);
		} else{
			l = deleteAt(l, k);
		}
		printList(l);
	}
}
