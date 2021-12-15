package laptrinhhuongdoituong;
import java.util.Scanner;

public class hienthiramanhinh {
	public static void main(String[] agrs) {
		 int a,n;
		    Scanner t=new Scanner(System.in);
		     System.out.printf("Nhap n: ");
		     a=t.nextInt();
		     System.out.println();
		     n=a;
		   for (int r=1;r<=a;r++){
		     for(int b=1;b<=r;b++){
		      System.out.println(" ");}
		   for (int c=1;c<=n;c++){
			System.out.println("*");}
		   for (int c=a-r;c>=1;c--){
			System.out.println("*");}
		  n--;
		  System.out.println();
		   }
    	}
	}