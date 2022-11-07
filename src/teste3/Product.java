package teste3;

public class Product {
	private String name;
	private Double price;
	
	public Product() {}
	
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	
	// ********** GETTERS **********
	
	public String getName() {
		return name;
	}
	
	public Double getPrice() {
		return price;
	}
	
	// ********** SETTERS **********
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	// ********** OTHER METHODS **********
	
	public String priceTag() {
		return name + " $ " + price;
	}
}
