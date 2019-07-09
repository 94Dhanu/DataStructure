package Dj.design.visitor;
public class ShoppingCartClient {

	public static void main(String[] args) {
		ItemElement[] items = new ItemElement[]{new Book(10, "1234"),new Book(100, "5678"),
				new Fruit(10, 3, "Banana"), new Fruit(6, 6, "Apple")};
		
		int total = calculatePrice(items);
		System.out.println("Total Cost = "+total);
	}

	private static int calculatePrice(ItemElement[] items) {
		ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
		int sum=0;
		for(ItemElement item : items){
			sum = sum + item.accept(visitor);
		}
		return sum;
	}

}

