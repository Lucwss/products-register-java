package teste3;

public class ImportedProduct extends Product {
	
	private Double customsFee;
	
	public ImportedProduct() { super(); }
	
	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}
	
	// ********** GETTERS **********
	
	public Double getCustomsFee() {
		return customsFee;
	}
	
	// ********** SETTERS **********
	
	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	// ********** OTHER METHODS **********
	
	public Double totalPrice() {
		return this.getPrice() + customsFee;
	}
	
	@Override
	public String priceTag() {
		return this.getName() + " $ " + totalPrice() + " (Customs fee: $ " + customsFee + ")";
	}
}
