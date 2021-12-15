package Stack;

import java.util.Scanner;

public class Queu {
	private Node[] stack;
	 /* Các phương thức khởi dựng */
	 public void MyQueu(){}
	 public void MyQueu(Node[] stack){
	  this.stack=stack;
	 }
	 
	 /* Phương thức lấy ra một node từ đầu queu */
	 public Node remove(){
	  Node result =  null;
	  if ((stack != null) && (stack.length > 0)){
	   result = stack[0];
	   // Loại bỏ node đầu hàng đợi 
	   Node[] tam = new Node[stack.length - 1];
	   for (int i = 0; i < stack.length -1; i++)
	    tam[i] = stack[i + 1];
	   this.stack = tam;
	  }
	  return result;
	 }
	 
	 /* Phương thức thêm một node vào cuối queu */
	 public void insert(Node x){
	  if (stack == null){ 
		  // Hàng đợi đang rỗng 
		  stack = new Node[1];
		  stack[0] = x;
	  }
	  
	  else{ // Hàng đợi đã có dữliệu 
	   Node[] tam = new Node[stack.length + 1];
	   for (int i = 0; i<stack.length; i++)
		   tam [i] = stack[i];
	   tam [stack.length] = x;
	   this.stack = tam ;
	  		}
	 }
	 
	 public static void main(String  agrs[])
	 {
		 Queu a= new Queu();
		 Node tam7=new Node();
		 a.insert(tam7);
		 Node tam1 = new Node();
		 a.insert(tam1);
		 Node tam2 = new Node();
		 a.insert(tam2);
		 Node tam3 = new Node();
		 System.out.println("hien thi:");
		 a.insert(tam3);
		 System.out.println("nhap so phan tu can dung");
		 int n;
		 Scanner aa=new Scanner(System.in);
		 n=aa.nextInt();
		 Mystack b=new Mystack();
		 for(int i=0;i<n;i++)
		 {
			 System.out.println("nhap phan tu");
			 int gt=aa.nextInt();
			 Node t=new Node();
			 System.out.println("hien thi:" +4);
			 		Node tam4 = new Node();
					a.insert(tam4);
		 }
		 while( a!=null) {
		 Node ab = a.remove();
		 System.out.println("hien thi:" +ab.hthi());
		 			}
	 			}
}
