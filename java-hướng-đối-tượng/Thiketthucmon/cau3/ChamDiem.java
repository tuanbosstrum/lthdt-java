package cau3;

public class ChamDiem {
	public String maSV;
	public String hoTen;
	public double diemThi;
	
	public ChamDiem(String maSV, String hoTen, double diemThi) {
		this.maSV = maSV;
		this.hoTen = hoTen;
		this.diemThi = diemThi;
	}
	
	public void inSinhVien() {
		System.out.printf("Mã Sinh Viên: %s - Họ và Tên Sinh Viên: %s - Điểm thi: %s \n",this.maSV, this.hoTen, this.diemThi);
	}

}
