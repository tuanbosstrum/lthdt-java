package sach;

import java.util.Scanner;

public class sach {
	private String ma, ngaysx;
	private int dt;
	private double soluong;
	
	public sach() {
		
	}
	public sach(String ma, String ngaysx, int dt, double soluong) {
		super();
		this.ma = ma;
		this.ngaysx = ngaysx;
		this.dt = dt;
		this.soluong = soluong;
	}
	public String getMa() {
		return ma;
	}
	public void setMa(String ma) {
		this.ma = ma;
	}
	public String getNgaysx() {
		return ngaysx;
	}
	public void setNgaysx(String ngaysx) {
		this.ngaysx = ngaysx;
	}
	public int getDt() {
		return dt;
	}
	public void setDt(int dt) {
		this.dt = dt;
	}
	public double getSoluong() {
		return soluong;
	}
	public void setSoluong(double soluong) {
		this.soluong = soluong;
	}
	
	public void nhap() {
		Scanner tam=new Scanner(System.in);
		System.out.println("ma");
		ma=tam.nextLine();
		System.out.println("ngay san xuat");
		ngaysx=tam.nextLine();
		System.out.println("doanh thu");
		dt=tam.nextInt();
		System.out.println("so luong sach");
		soluong=tam.nextDouble();
	}

	public void hienthi() {
		System.out.println("ma giao dich" +this.getMa());
		System.out.println("ngay san xuat" +this.getNgaysx());
		System.out.println("doanh thu" +this.getDt());
		System.out.println("so luong sach" +this.getSoluong());
	}
}
