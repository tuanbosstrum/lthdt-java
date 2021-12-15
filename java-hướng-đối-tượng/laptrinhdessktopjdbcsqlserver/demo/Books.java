package demo;

public class Books {
	private int ID;
	private String Title;
	private float Price;
	
	public Books(){
		
	}
	public Books(int ID, String Title, float Price) {
		this.ID = ID;
		this.Title = Title;
		this.Price = Price;
	}
	public Books(String Title, float Price) {
		this.Title = Title;
		this.Price = Price;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public float getPrice() {
		return Price;
	}
	public void setPrice(float price) {
		Price = price;
	}
	void hienthi() {
		System.out.print("ID:" + ID + "\n");
		System.out.print("Title:" + Title + "\n");
		System.out.print("Price:" + Price);
	}
		public static void main(String[] agrs) {
			Books cx= new Books();
			System.out.print("====================");
			cx.hienthi();
		}
}
