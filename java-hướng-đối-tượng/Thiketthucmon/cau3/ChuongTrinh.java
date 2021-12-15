package cau3;

public class ChuongTrinh {
	public static void main(String[] args) {
		ChamDiem sv1 = new ChamDiem("190032","Hoàng Lê Anh Tuấn",5.5);
		ChamDiem sv2 = new ChamDiem("190025","Nguyễn Phong",9.5);
		ChamDiem sv3 = new ChamDiem("190063","Lê Hòa",7.9);
		ChamDiem sv4 = new ChamDiem("190054","Lưu Hiệp",7.9);
		ChamDiem sv5 = new ChamDiem("190012","Lê Hữu Tuấn",8.4);
		
		ArrayStack stack = new ArrayStack(1000);
		
		stack.push(sv1);
		stack.push(sv2);
		stack.push(sv3);
		stack.push(sv4);
		stack.push(sv5);
		
		stack.printStack();
		
		System.out.println("------------");
		
		ChamDiem sv = stack.pop();
		sv.inSinhVien();
		
		System.out.println("------------");
		stack.printStack();
		
		System.out.println("------------");
		
		ChamDiem sv10 = stack.peek();
		sv10.inSinhVien();
		System.out.println("------------");
		stack.printStack();
		
	}
}
