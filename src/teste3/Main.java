package teste3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		SimpleDateFormat formatBR = new SimpleDateFormat("dd/MM/yyyy");
		List<Product> products = new ArrayList<>(); 
		
		System.out.print("Enter the number of products: ");
		Integer productsQuantity = input.nextInt();
		
		for(int i = 0; i < productsQuantity;i++) {
			showPosition(i);
			System.out.print("Common, used or imported (c/u/i)? ");
			Character choice = input.next().charAt(0);
			
			System.out.print("Name: ");
			input.nextLine();
			String name = input.nextLine();
			System.out.print("Price: ");
			Double price = input.nextDouble();
		
			switch(choice) {
				case 'c':
					products.add(new Product(name, price));
				break;
				case 'i':
					System.out.print("Customs fee: ");
					Double customsFee = input.nextDouble();
					products.add(new ImportedProduct(name, price, customsFee));
				break;
				case 'u':
					System.out.print("Manufacture Date (DD/MM/YYYY): ");
					Date manufactureDate = formatBR.parse(input.next());
					products.add(new UsedProduct(name, price, manufactureDate));
				break;
				default:
					System.out.println("Option not available, please try again");
				break;
			}
			
			breakLine();
			
		}
		
		priceTags(products);
		
		input.close();
	}
	
	public static void showPosition(Integer i) {
		System.out.printf("Product # %d data: \n", i+1);
	}
	
	public static void breakLine() {
		System.out.println();
	}
	
	public static void priceTags(List<Product> products) {
		System.out.print("PRICE TAGS: \n");
		for(Product product : products) {
			System.out.println(product.priceTag());
		}
	}

}
