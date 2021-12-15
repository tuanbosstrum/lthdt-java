package Treenew;



public class dssv {
	private static final String String = null;
	// Gốc của cây nhị phân 
			public Node root; 
			
			// Constructors 	
			
			dssv(String ID, String quequan, String ten, int ngaysinh, int key) { 		
				root = new Node(String, String, String, key); 	
				}
			public dssv() { 		
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
					System.out.print(node.toString() + " "); 	
					} 	 
			
			//Duyệt theo thứ tự giữa 	
			void printInorder(Node node) { 		
				if (node == null) 			
					return; 		
				
				//duyệt cây con trái 		
				printInorder(node.left); 
				
				// Duyệt nút hiện tại 		
				System.out.print(node.toString() + " ");
				
				//duyệt cây con phải 		
				printInorder(node.right); 	
				} 	
			
			
			//Duyệt theo thứ tự trước 	
			void printPreorder(Node node) { 		
				if (node == null) 			
					return; 		
				//Duyệt nút hiện tại 		
				System.out.print(node.toString() + "\n "); 	
				
				//Duyệt cây con trái 		
				printPreorder(node.left); 
				
				//Duyệt cây con phải 		
				printPreorder(node.right); 	
				} 	
				void printPostorder() { 		
					printPostorder(root); 	
					} 	
				public void printInorder() { 		
				printInorder(root); 	
				} 	void printPreorder() { 		
					printPreorder(root); 	
					} 	
				
				// main 	
				public static void main(String[] args) { 		
					dssv tree = new dssv(); 		
					tree.root = new Node("cssspxu","Hue","Tuan", 2001); 		
					tree.root.left = new Node("c190032", "quangtri", "Tuan", 2001 ); 		
					tree.root.right = new Node("c190085", "tp.hcm", "lam", 1999);
					tree.root.left.left = new Node("c190025", "hanoi", "c", 2001); 		
					tree.root.left.right = new Node("c158000", "tphcm", "d", 2001); 
					
					
					System.out.println("Duyệt cây theo thứ tự trước: "); 		
					tree.printPreorder(); 		
					
					System.out.println("\nDuyệt cây theo thứ tự giữa: "); 		
					tree.printInorder(); 		
					
					System.out.println("\nDuyệt cây theo thứ tự sau: "); 		
					tree.printPostorder(); 
					}
	

}
