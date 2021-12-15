package sach;
import java.util.Scanner;
public class stk extends sach {
	private String ngayxb;
	private double thue, thanhtien;
	
	public stk() {
		
	}
	public stk(String ngayxb, double thue, double thanhtien) {
		super();
		this.ngayxb = ngayxb;
		this.thue = thue;
		this.thanhtien = thanhtien;
	}
	public String getNgayxb() {
		return ngayxb;
	}
	public void setNgayxb(String ngayxb) {
		this.ngayxb = ngayxb;
	}
	public double getThue() {
		return thue;
	}
	public void setThue(double thue) {
		this.thue = thue;
	}
	public double getThanhtien() {
		return thanhtien;
	}
	public void setThanhtien(double thanhtien) {
		this.thanhtien = thanhtien;
	}
	
	public void nhap() {
		super.nhap();
		Scanner tam=new Scanner(System.in);
		System.out.println("ngay xuat ban");
		ngayxb=tam.nextLine();
		System.out.println("ma thue");
		thue=tam.nextDouble();
		System.out.println("thanh tien");
		thanhtien=tam.nextDouble();
		thanhtien=getSoluong()*getThue();
		
	}
	
	public void hienthi() {
		super.hienthi();
		System.out.println("ngay xuat ban" +this.getNgayxb());
		System.out.println("ma thue" +this.getThue());
		System.out.println("thanh tien" +this.getThanhtien());
		
	}
	}
