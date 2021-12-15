package Tree;


public class Node {
public int key;
public Node left;
public Node right;
public Node(int item) {
	key=item;
	left=right=null;
}
void printPreorder(Node node) {
	if (node == null)
		return;
	System.out.print(node.key + " ");
	
	printPreorder(node.left);
	
	printPreorder(node.right);
	}
}