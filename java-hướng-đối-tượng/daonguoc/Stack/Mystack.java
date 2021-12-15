package Stack;
import java.util.Scanner;
public class Mystack {
	private Node[] stack;
	 /* Các phương thức khởi dựng */
	 public Mystack(){}
	 public Mystack(Node[] stack){
	  this.stack = stack;
	 }
	 
	 
	 /* Phương thức lấy ra một node từstack */
	 public Node pop(){
	  Node result = null;
	  if ((stack != null) && (stack.length > 0)){
	   result = stack[stack.length - 1];
	   
	   
	   // Loại bỏnode cuối cùng 
	   Node[] tam = new Node[stack.length - 1];
	   for (int i = 0; i < stack.length - 1; i++) 
		   tam [i] = stack[i];
	   this.stack = tam ;
	  }                                                                                                                                                                                                                                                                                                                                                   
	  return result;
	 }
	 
	 
	 public void push(Node x)
	 {
			if (stack == null) {
				stack = new Node[1];
				stack[0] = x;
			} else { // Ngăn xếp đã có dữliệu
				Node tam[] = new Node[stack.length + 1];
				for (int i = 0; i < stack.length; i++)
					tam[i] = stack[i];
				tam[stack.length] = x;
				this.stack = tam;
			}	
	}
	 public static void main(String  agrs[])
	 {
		 Mystack a= new Mystack();
		 Node tam7=new Node();
		 a.push(tam7);
		 Node tam1 = new Node();
		 a.push(tam1);
		 Node tam2 = new Node();
		 a.push(tam2);
		 Node tam3 = new Node();
		 System.out.println("hien thi:");
		 a.push(tam3);
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
					a.push(tam4);
		 }
		 while( a!=null) {
		 Node ab = a.pop();
		 System.out.println("hien thi:" +ab.hthi());
		 			}
	 			}
			}


