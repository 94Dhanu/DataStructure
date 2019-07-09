package Dj.design.visitor;

public class Book implements ItemElement {

	private int price;
	private String isbnNumber;
	
	public Book(int cost, String isbn){
		this.price=cost;
		this.isbnNumber=isbn;
	}
	
	public int getPrice() {
		return price;
	}

	public String getIsbnNumber() {
		return isbnNumber;
	}


	public int accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}

	@Override
	public int accept(ShoppingCartVisitorImpl visitor) {
		// TODO Auto-generated method stub
		return 0;
	}

}
