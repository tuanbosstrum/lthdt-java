package timkiem;

import java.util.Scanner;

public class NPTK {
	// Gốc của cây nhị phân
				Node root;

				// Constructors
				NPTK(int key) {
					root = new Node(key);
				}

				NPTK() {
					root = null;
				}
				Node insertNode(Node item, int x) {

					if (item == null) {
						Node temp = new Node(x);
						return temp;

					} else {
						// node trái nhỏ hơn node cha
						if (x < item.key) {
							item.left = insertNode(item.left, x);

						}
						// node phải lớn hơn node cha
						else {
							item.right = insertNode(item.right, x);
						}
					}
					return item;

				}
				// Duyệt cây nhị phân tìm kiếm theo thứ tự giữa
				void DuyetGiua(Node t) {

					if (t != null) {
						DuyetGiua(t.left);
						System.out.print(t.key + " ");
						DuyetGiua(t.right);
					}
				}

				// Duyệt cây nhị phân tìm kiếm theo thứ tự trước
				void DuyetTruoc(Node t) {

					if (t != null) {
						System.out.print(t.key + " ");
						DuyetTruoc(t.left);
						DuyetTruoc(t.right);
					}
				}
				//xóa
				void deleteNode(Node item){
					if(item != null){
						 deleteNode(item.left);
						 deleteNode(item.right);
						item=null;
					}
				}
				Node deleteNumber(Node item, int x){
					if (item != null){
						if (item.key == x){
							deleteNode(item.left);
							deleteNode(item.right);
							item = null;
						}
						else if (item.key > x) item.left = deleteNumber(item.left, x);
						else item.right = deleteNumber(item.right, x);		
					}
					return item;
				}
				//tìm kiếm
				int count(Node item, int x){
					if (item ==null) return 0;
					if (item.key == x) return 1 + count(item.left, x) + count(item.right, x);
					else if (item.key < x) return count(item.right, x);
					return count(item.left, x);
				}

				// Duyệt cây nhị phân tìm kiếm theo thứ tự sau
				void DuyetSau(Node t) {

					if (t != null) {

						DuyetSau(t.left);
						DuyetSau(t.right);
						System.out.print(t.key + " ");
					}
				}
				public static void main(String[] args) {
					NPTK tree = new NPTK();
					int n, x, k,f;
					Scanner tam = new Scanner(System.in);
					System.out.println("Nhập số note của cây");
					n = tam.nextInt();
					Node t = null;
					for (int i = 1; i <= n; i++) {
						System.out.println("nhập note thứ " + i);
						x = tam.nextInt();
						t = tree.insertNode(t, x);
					}
					
					System.out.println("duyệt theo thứ tự giữa");
					tree.DuyetGiua(t);
					System.out.println();
					System.out.println("duyệt theo thứ tự trước");
					tree.DuyetTruoc(t);
					System.out.println();
					System.out.println("duyệt theo thứ tự sau");
					tree.DuyetSau(t);
					System.out.println("nhập nút muốn xóa");
					k=tam.nextInt();
					t=tree.deleteNumber(t, k);
					if(t==null) System.out.println("null");
					else tree.DuyetGiua(t);
					System.out.println("nhập giá trị muốn tìm kiếm");
					f=tam.nextInt();
					System.out.println(tree.count(t, f));
					
					
					

				}

}
