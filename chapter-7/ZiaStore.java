import java.util.ArrayList;

class CreditCard{
	private final long number;
	private final int cvv;
	private String validThrough;
	
	public CreditCard(long number, int cvv, String validThrough){
		
		this.number = number;
		this.cvv = cvv;
		this.validThrough = validThrough;
	
	}
}

class Customer{
	private String name;
	private CreditCard creditCard;
	
	public Customer(String name, long number, int cvv, String validThrough){
		this.name = name;
		this.creditCard = new CreditCard(number, cvv, validThrough);
		
	}
	
	public Customer(String name, CreditCard creditCard){
		this.name = name;
		this.creditCard = creditCard;
		
	}
}

class Product{
	private final String name;
	private int price;
	
	public Product(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	public int getPrice(){
		return price;
	}
	@Override
	public String toString(){
		return "Product{" + "name='"+name+'\''+", price="+price+"}";
	}
}

class ShoppingCart{
	private ArrayList<Product> products = new ArrayList<>();
	
	public void addProduct(Product product){
		products.add(product);
	}
	
	public int getTotalPrice(){
		int totalPrice = 0;
		for(Product product : products){
			totalPrice+=product.getPrice();
		}
		
		return totalPrice;
	}
	
	@Override
	public String toString(){
		return "ShoppingCart{products="+products+'}';
	}
}

public class ZiaStore{
	public static void main(String[] args){
	
		Product p = new Product("Phone", 1400);
		Product keyboard = new Product("Mechanical Gaming Keyboard", 40);
		Product mouse = new Product("Gaming Mouse", 45);
		Product ecoDot = new Product("Eco Dot (4th Generation)", 40);
		
		ShoppingCart shoppingCart = new ShoppingCart();
		shoppingCart.addProduct(p);
		shoppingCart.addProduct(keyboard);
		shoppingCart.addProduct(mouse);
		shoppingCart.addProduct(ecoDot);
		
		
		System.out.println("ShoppingCart = " + shoppingCart);
		System.out.println("totalPrice = " + shoppingCart.getTotalPrice());
	}
}
