package bai25;

import java.util.Scanner;

public class Listlinker {
	static void printList(Node l){
		Node p = l;
		while (p != null){
			System.out.print(p.data+ " ");
			p = p.next;
		}
	}

	static Node addElement(Node p, int x){
		Node temp = createNode(x);
		return temp;
	}

	private static Node createNode(int x) {
		// TODO Auto-generated method stub
		return null;
	}

	static Node convert(Node l, int a, int b){
		Node p = l;
		while (p != null){
			if (p.data == a){
				p.data = b;
			}
			p = p.next;
		}
		return l;
	}

	public static void main(String[] agrs){
		Scanner tam=new Scanner(System.in);
		int n, x, a, b;
		n=tam.nextInt();
		x=tam.nextInt();
		Node l = createNode(x);
		Node p = l;
		for (int i = 1; i < n; i++){
			x=tam.nextInt();
			p = addElement(p, x);
		}
		a=tam.nextInt();
		b=tam.nextInt();
		l = convert(l, a, b);
		printList(l);
	}

}
