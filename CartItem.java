package package1;

public class CartItem {
	private String[] book=new String[7];
	private String bookId;
	private int count;
	private int total_price;
	
	CartItem(String[] pbook) {
		this.book=pbook;
		this.bookId=this.book[0];
		this.count=1;
		this.total_price=Integer.parseInt(this.book[2]) * this.count;
	}
	
	String getBookId() {
		return this.bookId;
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
