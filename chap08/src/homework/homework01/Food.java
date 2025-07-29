package homework.homework01;

public class Food extends Product {
	private int expiration;

	public Food() {
	}

	public Food(String name, int price, int expirationDays) {
		super(name, price);
		this.expiration = expirationDays;
	}

	public int getExpiration() {
		return expiration;
	}

	public int calculateDiscountRate() {
		if(expiration <= 1)
			return 80;
		else if (expiration <= 5)
			return 50;
		else if (expiration <= 10)
			return 20;
		else
			return 0;
	}
	
	public int calcultarePrice() {
		return (getPrice()-(calculateDiscountRate()/100)*getPrice());
		
	}
}
