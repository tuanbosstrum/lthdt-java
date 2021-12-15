package Bai1;
import java.util.Scanner;
public class Chuyenxenoithanh {
	String hoten;
	int maso, sotuyen;
	double sokm;
	long doanhthu;
	
	
	public Scanner tam=new Scanner(System.in);
	
	void nhap() {
		System.out.println("nhap ho ten");
		hoten=tam.nextLine();
		hoten=tam.nextLine();
		System.out.println("nhap ma so xe");
		maso=tam.nextInt();
		System.out.println("nhap so tuyen xe chay");
		sotuyen=tam.nextInt();
		System.out.println("Nhap so km xe di duoc");
		sokm=tam.nextDouble();
		System.out.println("nhap doanh thu");
		doanhthu=tam.nextLong();
		}
	
	void hienthi() {
		System.out.println("nhap ho ten:%d,hoten");
		System.out.println(" ");
		System.out.println("nhap ma so xe:%d, maso ");
		System.out.println(" ");
		System.out.println("nhap so tuyen xe chay:%d, sotuyen" );
		System.out.println(" ");
		System.out.println("nhap so km ma xe chay:%f, sokm");
		System.out.println(" ");
		System.out.println("nhap doanh thu:%f, doanhthu" );
		System.out.println(" ");
		}

}
