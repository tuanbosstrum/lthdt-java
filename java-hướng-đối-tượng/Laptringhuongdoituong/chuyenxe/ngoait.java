package chuyenxe;
import java.util.Scanner;
public class ngoait extends chuyenxe {
	
	private String ht;
	private double nd, dt;
	
	public ngoait() {
		
	}
	public ngoait(String ht, double nd, double dt) {
		super();
		this.ht = ht;
		this.nd = nd;
		this.dt = dt;
	}
	public String getHt() {
		return ht;
	}
	public void setHt(String ht) {
		this.ht = ht;
	}
	public double getNd() {
		return nd;
	}
	public void setNd(double nd) {
		this.nd = nd;
	}
	public double getDt() {
		return dt;
	}
	public void setDt(double dt) {
		this.dt = dt;
	}
	
	public void nhap() {
		Scanner tam=new Scanner(System.in);
		super.nhap();
		System.out.println("ho ten");
		ht=tam.nextLine();
		System.out.println("noi den");
		nd=tam.nextDouble();
		System.out.println("doanh thu");
		dt=tam.nextDouble();
		dt=getNd()*getDt();
		
		
	}
	
	public void hienthi() {
		super.hienthi();
		System.out.println("ho ten" +this.getHt());
		System.out.println("noi den" +this.getNd());
		System.out.println("doanh thu" +this.getDt());
	}

}
