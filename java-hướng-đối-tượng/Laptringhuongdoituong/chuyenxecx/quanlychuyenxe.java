package chuyenxecx;

public class quanlychuyenxe {

	chuyenxe[] cx=new chuyenxe[100];
	int dem=0; double tongnoi=0, tongngoai=0;
	
	void nhapnoi(){
		cx[dem]=new noit();
		noit a=new noit();
		a.nhap();
		tongnoi=tongnoi+a.getSkm();
		dem++;
		}
	void nhapngoai() {
		cx[dem]=new ngoait();
		ngoait a=new ngoait();
		a.nhap();
		tongngoai=tongngoai+a.getNd();
		dem++;
	}
	void hienthi() {
		for(int i = 0;i<dem;i++) {
			cx[i].hienthi();	
		}
	}	
	
}
