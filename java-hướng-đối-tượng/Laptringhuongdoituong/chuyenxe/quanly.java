package chuyenxe ;

public class quanly {
	chuyenxe[] cx=new chuyenxe[100];
	int dem=0;
	double tongnt=0, tongngoait=0;
   void nhapnt() {
		cx[dem]=new nt();
		nt a=new nt();
		a.nhap();
		tongnt=tongnt+a.getSkm();
		dem++;
	}

	void nhapngoait() {
		cx[dem]	=new ngoait();
		ngoait a=new ngoait();
		a.nhap();
		tongngoait=tongngoait+a.getNd();
		dem++;
	}
	
	void hienthi() {
		for(int i=0;i<dem;i++) {
			cx[i].hienthi();
		}
	}
}
