package teste3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
	
	SimpleDateFormat formatBR = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date manufactureDate;
	
	public UsedProduct() { super(); }
	
	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}
	
	// ********** GETTERS **********
	
	public Date getManufactureDate() {
		return manufactureDate;
	}
	
	// ********** SETTERS **********
	
	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	// ********** OTHER METHODS **********
	
	@Override
	public String priceTag() {
		return this.getName() + " (used) $ " + this.getPrice() + " (Manufacture date: " + formatBR.format(manufactureDate) + ")";
	}
	
}
