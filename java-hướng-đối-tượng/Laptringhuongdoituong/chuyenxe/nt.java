package chuyenxe;

import java.util.Scanner;

public class nt extends chuyenxe {
	private String ht;
	private double skm,dt;
	
	
	public nt() {
		
	}
	public nt(String ht, double skm) {
		super();
		this.ht = ht;
		this.skm = skm;
		
	}
	public nt(double dt) {
		super();
		this.dt = dt;
	}
	public double getDt() {
		return dt;
	}
	public void setDt(double dt) {
		this.dt = dt;
	}
	public String getHt() {
		return ht;
	}
	public void setHt(String ht) {
		this.ht = ht;
	}
	public double getSkm() {
		return skm;
	}
	public void setSkm(double  skm) {
		this.skm = skm;
	}
	
	public void nhap() {
		Scanner tam=new Scanner(System.in);
		super.nhap();
		System.out.println("ho ten tx");
		ht=tam.nextLine();
		System.out.println("so km di duoc");
		skm=tam.nextDouble();
		System.out.println("doanh thu");
		dt=tam.nextDouble();
		dt=getSkm()*getDongia();
		
	}
	
	public void hienthi() {super.hienthi();
		System.out.println("ho ten" +this.getHt());
		System.out.println("so km" +this.getSkm());
		System.out.println("doanh thu" +this.getDt());
	}

}
