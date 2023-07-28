package 키오스크.model;

public class Dto {
	private String name;
	private int price;
	private int stock;
	private int basket;
	
	public Dto() {}
	

	public Dto(String name, int price, int stock, int basket) {
		super();
		this.name = name;
		this.price = price;
		this.stock = stock;
		this.basket = basket;
		
		
	}
	
	


	public Dto(String name, int price, int stock) {
		super();
		this.name = name;
		this.price = price;
		this.stock = stock;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}


	public int getBasket() {
		return basket;
	}


	public void setBasket(int basket) {
		this.basket = basket;
	}


	@Override
	public String toString() {
		return "Dto [name=" + name + ", price=" + price + ", stock=" + stock + ", basket=" + basket + "]";
	}
	
}