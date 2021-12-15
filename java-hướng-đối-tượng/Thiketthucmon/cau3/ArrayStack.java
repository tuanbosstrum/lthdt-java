package cau3;

public class ArrayStack {
	public ChamDiem[] listSV;
	public int top;
	private int i;
	
		public ArrayStack(int size) {
		listSV = new ChamDiem[size];
		}
			public void push(ChamDiem sv) {
				if(top< listSV.length) {
			top++;
			listSV[top] = sv;
				}
			}
			public ChamDiem pop(){
				if(top == 0) {
			return null;
				}
				ChamDiem sv = listSV[top];
				top--;
				return sv;
			}
			public ChamDiem peek() {
				if(top == 0) {
					return null;
				}
				ChamDiem sv = listSV[top];
				return sv;
				}
	public void printStack() {
		for(int i=1; i<= top; i++) {
		listSV[i].inSinhVien();
	}
	

	}
}
