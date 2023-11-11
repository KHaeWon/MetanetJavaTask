package Market;

public abstract class Product {

	protected String name;
	protected int price;
	protected String seller;
	
	
	
	public Product(String name, int price, String seller) {
		super();
		this.name = name;
		this.price = price;
		this.seller = seller;
	}

	

	abstract public void printDetailInfo();
	
}
