package Baitap;
import java.util.Scanner;
public class Baitapmang {
	
	public static int a[];
	public static int n;
	
	
	public static void main(String agrs[])
	{a=new int [100];
	Scanner ac=new Scanner(System.in);
	System.out.println("nhap n:");
	n=ac.nextInt();
	nhapmang(n);
	xuatmang(n);
	System.out.println();
	sapxep(n);
	hienthisapxep(n);
	System.out.printf("\ntong chan cac phan tu trong mang la:%d",tongchan(n));
	System.out.printf("\nso lon nhat trong mang la:%d",solonnhat(n));
	sohoanhao(n);
	ac.close();
	}
	//nhapmang;
		public static void nhapmang(int n) 
		{int i;
		Scanner ac=new Scanner(System.in);
		for(i=0;i<n;i++)
			{System.out.printf("a[%d]=", i);
			a[i]=ac.nextInt();
			}
		ac.close();
		}
		//xuatmang
		public static void xuatmang(int n)
		{int i;
			for(i=0;i<n;i++)
			System.out.printf("%d ", a[i]);
		}
		//sapxep00;
		public static void sapxep(int n)
		{int i,j,tg;
		for (i=0;i<n;i++)
			for(j=0;j<=i;j++)
				if(a[i]<a[j])
				{tg=a[i];a[i]=a[j];a[j]=tg;}
		}
		//hienthisapxep00;
		public static void hienthisapxep(int n)
		{int i;
			for(i=0;i<n;i++)
			System.out.printf("%d ", a[i]);
		}
		//tongchan
		public static int tongchan(int n)
		{int i,s=0;
		for(i=0;i<=n;i++)s=s+a[i];
		return(s);
		}
		//solonnhat
		public static int solonnhat(int n)
		{int i,max=a[0];
		for (i=1;i<n;i++)
			if(max<a[i])max=a[i];
		return (max);
		}
		//sohoanhao
		public static void sohoanhao(int n)
		{
			int i,j,d;
		for (i=1;i<n;i++)
		{ d=0;
			for(j=1;j<a[i];j++) 
			{
				if(a[i]%j==0) d=d+j;
			}
			if(a[i]==d)System.out.printf(" \nSHH la:%d",a[i]);		
		}
	}
}

