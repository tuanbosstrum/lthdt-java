package sach;
 import java.util.Scanner;
public class sgk extends sach {
	
	private String masach;
	private double thue, thanhtien;
	
	public sgk() {
		
	}
	public sgk(String masach, double thue, double thanhtien) {
		super();
		this.masach = masach;
		this.thue = thue;
		this.thanhtien = thanhtien;
	}
	public String getMasach() {
		return masach;
	}
	public void setMasach(String masach) {
		this.masach = masach;
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
		System.out.println("ma sach");	
		masach=tam.nextLine();
		System.out.println("ma so thue");
		thue=tam.nextDouble();
		System.out.println("thanh tien");
		thanhtien=tam.nextDouble();
		thanhtien=getSoluong()*getThue();
	}

	public void hienthi()	{
		super.hienthi();
		System.out.println("ma sach" +this.getThanhtien());
		System.out.println("ma so thue " +this.getThue());
		System.out.println("thanh tien" +this.getThanhtien());
	}
}
