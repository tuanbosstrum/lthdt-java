package danhsach;

public class dssv {
	Node root;
	public dssv() {
		// todo auto-generated construcor stub
		Node root;
		root=null;
	}
	// ttg
	void printInorder(Node node) {
		Node root;
		if(node==null) 
			return;
			printInorder(node.left);
			System.out.print(node.toString()	+"\n"	);	
	}
		void printInorder() {
			printInorder(root);
	
			}
}
