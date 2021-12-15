package danhsach;

import Treenew.Node;
import Treenew.dssv;

public class runcay {
		public static void main(String[]  agrs){
			dssv d=new dssv();		
			d.root=new Node("pxuc190032", "Hoang A", "Hue", +2001);
			d.root.left=new Node("pxu190078", "Nguyen B", "Hue", +1994);
			d.root.right=new Node("pxu190079", "Le C", "Hue", +1999);
			d.root.left.left=new Node("pxu190079", "Le C", "Hue", +1997);
			d.root.left.right=new Node("pxu190079", "Hoang C", "Hue", +2000);
			
			System.out.println("Duyệt cây theo thứ tự trước: "); 		
			d.printInorder(); 		
			
			System.out.println("\nDuyệt cây theo thứ tự giữa: "); 		
			d.printInorder();; 		
			
			System.out.println("\nDuyệt cây theo thứ tự sau: "); 		
			d.printInorder(); 
			
		}
}