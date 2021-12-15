package sach;

import java.util.Scanner;
public class listchay {
	public static void main(String agrs[]) {
		quanly ql=new quanly();
		int n;
		do {
			Scanner tam=new Scanner(System.in);
			System.out.println("==================");
			System.out.println("=====lua chon=====");
			System.out.println("1.Nhap thong tin sach giao khoa");
			System.out.println("2.Nhap thong tin sach tham khao");
			System.out.println("3.Hien thi cac sach");			
			System.out.println("4.Dung chuong trinh");
			n=tam.nextInt();
			switch(n) {
			case 1:{ql.nhapsgk();break;}
			case 2:{ql.nhapstk();break;}
			case 3:{ql.hienthi();break;}
		  }
		}
		while(n!=4); {System.out.println("Chuong trinh da dung!");
		}}}
