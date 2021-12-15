package cau2;


	public class SinhVienNode {
		public SinhVien data;
		public SinhVienNode prev;
		public SinhVienNode next;
		
		public SinhVienNode(SinhVien data) {
			this.data = data;
			this.next = null;
			this.prev = null;
		}
		public SinhVienNode() {
			this.data = null;
			this.next = null;
			this.prev = null;
		}
		
		public void inSinhVienNode() {
			System.out.printf("MaSV: %s \nHo Ten: %s \nDiem Qua Trinh: %2.1f \nDiem Thi: %2.1f \nDiem Tong Ket: %2.1f \n",
					data.maSV, data.hoTen, data.diemQT, data.diemThi, data.diemTK=(data.diemQT + data.diemThi)/2);
		
	}

}
