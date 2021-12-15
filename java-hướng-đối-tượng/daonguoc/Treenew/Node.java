package Treenew;

public class Node {
	private String ID; String QueQuan;
			String Ten;
		int NgaySinh;
	public Node left;
	public Node right;
	public int key;
	
	public Node(String ID, String quequan, String ten, int ngaysinh) {
		super();
		this.ID=ID;
		this.QueQuan=quequan;
		this.Ten=ten;
		this.NgaySinh=ngaysinh;
		this.left=null;
		this.right=null;
		
	}
	
	public String toString () { 			
			return ID + "," + Ten + "" + Ten + ", Quế Quân:" + QueQuan + ", Ngay Sinh:"; 	} 	 
	void printPreorder(Node node) {
		if (node == null)
			return;
		System.out.print(node.key + " ");
		printPreorder(node.left);
		printPreorder(node.right);
		}
	
}
