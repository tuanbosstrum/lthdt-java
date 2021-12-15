package cau2;

public class CHUONGTRINH {
	public static void main(String[] args) {
		SinhVien a = new SinhVien("190032c","Hoàng Anh Tuấn", 6, 7);
		SinhVien b = new SinhVien("190024c","Võ Phúc Hòa", 6, 4);
		SinhVien c = new SinhVien("190075c","Hoa Hùng", 2, 9);
		SinhVien d = new SinhVien("03","Lâm Phước Vỹ", 7, 3);
		SinhVien e = new SinhVien("08","Nguyễn Hoàng Cường", 5, 7);
		
		
		SinhVienNodeList List = new SinhVienNodeList();
		List.themTruoc(a);
		List.themTruoc(b);
		List.themTruoc(c);
		List.themTruoc(a);
		
		List.inDanhSach();
		
		List.themSau(e);
		List.inDanhSach();
		
		List.xoaSinhVien();
		List.inDanhSach();
		
		}

}
