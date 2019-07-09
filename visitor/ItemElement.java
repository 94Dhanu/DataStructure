package Dj.design.visitor;
public interface ItemElement {

	public int accept(ShoppingCartVisitorImpl visitor);

	public int accept(ShoppingCartVisitor visitor);
}

