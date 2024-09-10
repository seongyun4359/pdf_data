package package1;

public class CartItem {
	private String[] book=new String[7];
	private int count;
	private int total_price;
	
	CartItem(String[] pbook, int pcount) {
		this.book=pbook;
		this.count=pcount;
		this.total_price=Integer.parseInt(this.book[2]) * this.count;
	}
	
	String[] getBook() {
		return this.book;
	}
	
	int getCount() {
		return this.count;		
	}
	
	int getTotalPrice() {
		return this.total_price;
	}
	
	void setCount(int pcount) {
		this.count=pcount;
		this.total_price=Integer.parseInt(this.book[2]) * this.count;
	}	
}
