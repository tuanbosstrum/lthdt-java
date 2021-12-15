package cau2;

	public class SinhVienNodeList {
		public SinhVienNode head;
		public SinhVienNode tail;
		public int size;
		
		public void themTruoc(SinhVien data) {
			SinhVienNode node = new SinhVienNode(data);
			if(head == null) {
				tail = node;
				
			}else {
				node.next = head;
				head.prev = node;
			}
			head = node;
			size++;
		}
		
		public void themSau(SinhVien data) {
			SinhVienNode node = new SinhVienNode(data);
			if(tail == null) {
				head = node;
			}else {
				node.prev = tail;
				tail.next = node;
			}
			tail = node;
			size++;
		}
		
		public SinhVienNode xoaSinhVien() {
			if (head == null ) 
				return null;
			SinhVienNode x = head;
			head = head.next;
			x.next = null;
			size--;
			
			return x;
		}
		
		public void inDanhSach() {
			SinhVienNode tmp = new SinhVienNode();
			tmp = head;
			while(tmp != null) {
				tmp.inSinhVienNode();
				tmp = tmp.next;
			}
			System.out.printf("\n Co %d sinh vien -------\n", size);
		
	}

}
