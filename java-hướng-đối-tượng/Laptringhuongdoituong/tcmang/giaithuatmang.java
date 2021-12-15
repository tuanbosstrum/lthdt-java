package tcmang;
import java.util.Scanner;
public class giaithuatmang {
	public static void main(String[] agrs) {
		Scanner tam=new Scanner(System.in);
		int[] a = new int[100];
		System.out.println("nhap cac phan tu trong mang:");
		int n=tam.nextInt();
		for(int i = 0;i<n;i++) {
			System.out.println("nhap phan tu trong mang:");
			a[i]=tam.nextInt();
		}
		int tc=0;
		for(int i=0;i<n;i++) {
			if(a[i]%2==0) {
				tc=tc+a[i];
			}
		}
		System.out.printf("tong chan la: %d", tc	);
		System.out.println("");
		for (int i=0;i<n;i++) {
			if(a[i]%2==1) {
				System.out.printf("%d", a[i]);
			}
		}
		for(int i=0;i<n;i++) {
			if(a[i]<0) {
				System.out.printf("so am dau tien trong mang la:%d", a[i]); break;
			}
		}
	}

}
