package songuyen;

public class bai81 {
	public class Node {
		private int value;

		/* Các phuong th?c kh?i d?ng */
		public Node() {
			value = 0;
		}

		public Node(int value) {
			this.value = value;
		}

		/* Phuong th?c truy nh?p thu?c tính value */
		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}
	}
	public class MyQueue {
		private Node[] values;

		/* Các phuong th?c kh?i d?ng */
		public MyQueue() {
		}

		public MyQueue(Node[] values) {
			this.values = values;
		}
		
		/* Phuong th?c thêm m?t node vào stack */
		public void push(Node node) {
			if (values == null) { // Ngan x?p dang r?ng
				values = new Node[1];
				values[0] = node;
			} else { // Ngan x?p dã có d?li?u
				Node[] tmpNode = new Node[values.length + 1];
				for (int i = 0; i < values.length; i++) {
					tmpNode[i] = values[i];
				}
				tmpNode[values.length] = node;
				this.values = tmpNode;
			}
		}
		
		public int pop() {
			Node result = null;
			if ((values != null) && (values.length > 0)) {
				result = values[0];
				// Lo?i b? node d?u tiên
				Node[] tmpNode = new Node[values.length - 1];
				for (int i = 0; i < values.length - 1; i++) {
					tmpNode[i] = values[i+1];
				}
				this.values = tmpNode;
			}
			return result.getValue();
		}
		
		/* Phuong th?c l?y ra m?t node d?u tiên t? stack */
		public int front() {
			Node result = null;
			if ((values != null) && (values.length > 0)) {
				result = values[0];
			}
			return result.getValue();
		}

		/* Phuong th?c thêm m?t node vào stack */
		public void push(int a) {
			if (values == null) { // Ngan x?p dang r?ng
				values = new Node[1];
				values[0] = new Node(a);
			} else { // Ngan x?p dã có d?li?u
				Node[] tmpNode = new Node[values.length + 1];
				for (int i = 0; i < values.length; i++) {
					tmpNode[i] = values[i];
				}
				tmpNode[values.length] = new Node(a);
				this.values = tmpNode;
			}
		}

		public boolean empty() {
			return (values.length == 0);
		}
	}

	boolean b[] = new boolean[101];
		int c[] = new int[101];
		boolean a[][]= new boolean[101][101];
		boolean kt = false;
		int bfs(int u, int v, int n){
			MyQueue q = new MyQueue();
		    q.push(u);
		    b[u] = false;
		    while(!q.empty()){
		        int k = q.front();
		        for (int i = 1; i <=n; i++){
		            if (a[k][i] && b[i]){
		                c[i] = c[k] + 1;
		                b[i] = false;
		                q.push(i);
		                if (i == v) break;
		            }
		        }
		        q.pop();
		    }
		    return c[v];
		}
		int graphFunction(int n, int[][] e, int u, int v)
		{
		    for (int i = 0; i <= n; i++){
		        b[i] = true;
		        c[i] = 0;
		    }
		    for (int i = 1; i <= n; i++){
		        for (int j = 1; j <= n; j++){
		            a[i][j] = false;
		        }
		    }
		    for (int i = 0; i < e.length; i++){
		        a[e[i][0]][e[i][1]] = true;
	            a[e[i][1]][e[i][0]] = true;
		    }
		    int k = bfs(u, v, n);
		    return (k == 0) ? -1 : k;
		}


}
