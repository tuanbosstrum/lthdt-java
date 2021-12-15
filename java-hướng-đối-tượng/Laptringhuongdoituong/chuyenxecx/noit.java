package chuyenxecx;

import java.util.Scanner;

public class noit extends chuyenxe {
	private String ht;
	private double skm,dt;
	public noit() {
		
	}
	public noit(String ht, double skm, double dt) {
		super();
		this.ht = ht;
		this.skm = skm;
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
	public void setSkm(double skm) {
		this.skm = skm;
	}
	public double getDt() {
		return dt;
	}
	public void setDt(double dt) {
		this.dt = dt;
	}
	
	public void nhap() {
		super.nhap();
		Scanner tam=new Scanner(System.in);
		System.out.println("ho ten tai xe");
		ht=tam.nextLine();
		System.out.println("so km di");
		skm=tam.nextDouble();
		System.out.println("doanh thu");
		dt=tam.nextDouble();
		dt=skm+getDongia();
	}

	public void hienthi() {
		super.hienthi();
		System.out.println("ho ten" +this.getHt());
		System.out.println("so km di duoc" +this.getSkm());
		System.out.println("doanh thu" +this.getDt());
	}
}
