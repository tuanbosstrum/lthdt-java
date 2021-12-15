package cau2;

public class SinhVien {
	
		public String maSV;
		public String hoTen;
		public double diemQT;
		public double diemThi;
		public double diemTK;
		
		public SinhVien(String maSV, String hoTen, double diemQT, double diemThi) {
			this.maSV = maSV;
			this.hoTen = hoTen;
			this.diemQT = diemQT;
			this.diemThi = diemThi;
		
		}
		
		public void inSinhVien() {
			System.out.printf("MaSV: %s \nHo Ten: %s \nDiem Qua Trinh: %2.1f \nDiem Thi: %2.1f \nDiem Tong Ket: %2.1f\n",
					 this.maSV, this.hoTen, this.diemQT, this.diemThi, this.diemTK=(this.diemQT + this.diemThi)/2);
		
	}

}
