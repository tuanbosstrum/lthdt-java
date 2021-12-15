package sach;

public class quanly {
	sach[]	s=new sach[100];
	int dem=0; 
	double tongsgk=0, tongstk=0;
	void nhapsgk() {
		s[dem]=new sgk();
		sgk a=new sgk();
		tongsgk=tongsgk+a.getSoluong();
		dem++;
	}
	
	void nhapstk() {
		s[dem]=new stk();
		stk a=new stk();
		tongstk=tongstk+a.getSoluong();
		dem++;
	}

	void hienthi() {
		for(int i = 0;i<dem;i++) {
			s[i].hienthi();
		}
	}
}
