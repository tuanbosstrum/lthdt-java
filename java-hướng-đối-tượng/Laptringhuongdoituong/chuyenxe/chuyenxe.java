package chuyenxe;

import java.util.Scanner;

public class chuyenxe {
	private String makhach;
	private int soxe;
	private double dongia, dt;
	
	public chuyenxe() {
		
	}
	public chuyenxe(String makhach, int soxe, double dongia, double dt) {
		super();
		this.makhach = makhach;
		this.soxe = soxe;
		this.dongia = dongia;
		this.dt = dt;
	}
	public String getMakhach() {
		return makhach;
	}
	public void setMakhach(String makhach) {
		this.makhach = makhach;
	}
	public int getSoxe() {
		return soxe;
	}
	public void setSoxe(int soxe) {
		this.soxe = soxe;
	}
	public double getDongia() {
		return dongia;
	}
	public void setDongia(double dongia) {
		this.dongia = dongia;
	}
	public double getDt() {
		return dt;
	}
	public void setDt(double dt) {
		this.dt = dt;
	}
	
	public void nhap() {
		Scanner tam=new Scanner (System.in);
		System.out.println("ma khach");
		makhach=tam.nextLine();
		System.out.println("so xe");
		soxe=tam.nextInt();
	    System.out.println("don gia");
	    dongia=tam.nextDouble();
        System.out.println("doanh thu");
        dt=tam.nextDouble();}

	public void hienthi() {
		System.out.println("ma khach" +this.getMakhach());
		System.out.println("so xe " +this.getSoxe());
		System.out.println("don gia" +this.getDongia());
		System.out.println("doanh thu" +this.getDt());
		
		
	}
}
