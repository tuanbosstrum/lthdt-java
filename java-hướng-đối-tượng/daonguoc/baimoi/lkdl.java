package baimoi;
import java.util.LinkedList;
import java.util.Scanner;

public class lkdl {
	public static LinkedList<Integer> lk=new LinkedList<Integer>();
		public static void main(String[] agrs) {
			
			int vt, x;

			lk.add(7);

			lk.add(9);

			lk.add(4);
			
			nhap();
			

			Scanner scanner =new Scanner(System.in);

			System.out.println(" nhap vt can sua:");

			vt=scanner.nextInt();

			System.out.println(" nhap gia tri can sua");

			x=scanner.nextInt();

			sua(vt,x); 
			
			System.out.println(" nhap vt can chen:");

			vt=scanner.nextInt();

			System.out.println(" nhap gia tri can chen");

			x=scanner.nextInt();
			
			chen(vt,x);

			System.out.println(" nhap vt can xoa:");

			vt=scanner.nextInt();
			
			xoa(vt); 
			
			hthi();
		
			}

			public static void nhap() {
				int n;boolean ok=true;

			Scanner scanner =new Scanner(System.in);

			while (ok==true) { 
				System.out.println(" nhap phan tu dslk:");

			n=scanner.nextInt(); if(n==0) break;

			else lk.add(n); 
				} 
			}

			public static void chen(int vt, Integer x) {

			lk.add(vt,x); } 
			
			public static void xoa(int vt) { 
			
			lk.remove(vt);

			}

			public static void sua(int vt, Integer x) {

			Integer node= lk.set( vt, x);

			}

			public static void hthi() {
				int i;
				for (i=0;i<lk.size();i++)

				System.out.println(lk.get(i));
						}

}


