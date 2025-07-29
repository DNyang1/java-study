package homework.homework01;

public class Product {
	private String name;
	private int price;
	
	
	public Product() {
		super();
	}

	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public int calculatePrice() {
		return (price/10)*9;
	}
	
}
