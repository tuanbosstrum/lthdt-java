package Bai1;
import java.util.Scanner;
public class Chuyenxengoaithanh {
	String hoten;
	int maso, sotuyen,soxe,noiden;
double songaydiduoc;
	long doanhthu;
	
	
 Scanner tam=new Scanner(System.in);
	
	void nhap() {
		System.out.println("nhap ho ten");
		hoten=tam.nextLine();
		hoten=tam.nextLine();
		System.out.println("nhap ma so xe");
		maso=tam.nextInt();
		System.out.println("nhapso xe");
		soxe=tam.nextInt();
		System.out.println("nhap so tuyen");
		sotuyen=tam.nextInt();
		System.out.println("Nhap noi den");
		noiden=tam.nextInt();
		System.out.println("nhap  so ngay di duoc");
		songaydiduoc=tam.nextDouble();
		System.out.println("nhap doanh thu");
		doanhthu=tam.nextLong();
		}
	
	void hienthi() {
		System.out.println("nhap ho ten:%d, hoten");
		System.out.println(" ");
		System.out.println("nhap ma so xe:%d, maso" );
		System.out.println(" ");
		System.out.println("nhap so xe:%d, soxe");
		System.out.println(" ");
		System.out.println("nhap so tuyen xe chay:%d, sotuyen" );
		System.out.println(" ");
		System.out.println("nhap noi den:%d, noiden" );
		System.out.println(" ");
		System.out.println("nhap so km ma xe chay:%f, songaydiduoc");
		System.out.println(" ");
		System.out.println("nhap doanh thu:%f, doanhthu" );
		System.out.println(" ");
		}
	

}
