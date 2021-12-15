package tochucmang;
import java.util.Scanner;
public class giaithuatmang {
	public static void main(String[] agrs) {
		Scanner tam=new Scanner(System.in);
		 int[] a = new int[100];
		 System.out.println("nhap phan tu mang:");
		 int n=tam.nextInt();
		 for(int i=0;i<n;i++) {
		 System.out.println("nhap phan tu mang:");
		 a[i]=tam.nextInt();}
		 int tongchan=0;
		 for(int i=0;i<n;i++) { if(a[i]%2==0) {tongchan=tongchan+a[i];}
		 						}
		 System.out.printf("tong chan trong mang la %d", tongchan);
		 System.out.println("");
		
		 for(int i=0;i<n;i++) {if(a[i]%2==1) {System.out.printf("%d", a[i]);
		 									  System.out.println("");		}
		 										}
		 for(int i=0;i<n;i++) {if(a[i]<0) {System.out.printf("so am dau tien cua mang la:%d", a[i]);}
		 }
		 
	}
}
