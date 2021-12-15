package Tree;

public class BinaryTree {
	// Gốc của cây nhị phân 
	Node root; 
	
	// Constructors 	
	BinaryTree(int key) { 		
		root = new Node(key); 	
			} 	
	BinaryTree() { 		
		root = null; 	
		} 	
	
	//Duyệt thứ tự sau 	
	void printPostorder(Node node) { 
		if (node == null) 	
			return; 		
		
		// duyệt cây con trái 		
			printPostorder(node.left); 		
			// duyệt cây con phải 		
			printPostorder(node.right); 		
			// duyệt nút hiện tại 		
			System.out.print(node.key + " "); 	
			} 	 
	
	//Duyệt theo thứ tự giữa 	
	void printInorder(Node node) { 		
		if (node == null) 			
			return; 		
		
		//duyệt cây con trái 		
		printInorder(node.left); 
		
		// Duyệt nút hiện tại 		
		System.out.print(node.key + " ");
		
		//duyệt cây con phải 		
		printInorder(node.right); 	
		} 	
	
	
	//Duyệt theo thứ tự trước 	
	void printPreorder(Node node) { 		
		if (node == null) 			
			return; 		
		//Duyệt nút hiện tại 		
		System.out.print(node.key + " "); 	
		
		//Duyệt cây con trái 		
		printPreorder(node.left); 
		
		//Duyệt cây con phải 		
		printPreorder(node.right); 	
		} 	
		void printPostorder() { 		
			printPostorder(root); 	
			} 	
		void printInorder() { 		
		printInorder(root); 	
		} 	void printPreorder() { 		
			printPreorder(root); 	
			} 	
		
		// main 	
		public static void main(String[] args) { 		
			BinaryTree tree = new BinaryTree(); 		
			tree.root = new Node(1); 		
			tree.root.left = new Node(2); 		
			tree.root.right = new Node(3);
			tree.root.left.left = new Node(4); 		
			tree.root.left.right = new Node(5); 
			
			
			System.out.println("Duyệt cây theo thứ tự trước: "); 		
			tree.printPreorder(); 		
			
			System.out.println("\nDuyệt cây theo thứ tự giữa: "); 		
			tree.printInorder(); 		
			
			System.out.println("\nDuyệt cây theo thứ tự sau: "); 		
			tree.printPostorder(); 
			}
	}

