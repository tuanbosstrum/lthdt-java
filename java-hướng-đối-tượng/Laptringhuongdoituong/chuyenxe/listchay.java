package chuyenxe;
import java.util.Scanner;
public class listchay {
	public static void main(String agrs[]){
		
		quanly ql=new quanly();
		int n;
		do { 
			Scanner tam=new Scanner(System.in);
			System.out.println("==================");
			System.out.println("1.nhap n");
			System.out.println("2.noi thanh");
			System.out.println("3.ngoai thanh");
			System.out.println("4. hien thi all ");
			n=tam.nextInt();
		
		switch (n) {
		case 1: {ql.nhapnt(); break;}
		case 2:{ql.nhapngoait(); break;}
		case 3:{ql.hienthi(); break;}
		}}
		while(n!=4);
			System.out.println("dung chuong trinh");
		}}
