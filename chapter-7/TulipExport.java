import java.util.ArrayList;
class Product {
	private String name;
	private double price;
	private int quantity;
	private String sku;
	
	public Product(String name, double price, int quantity, String sku){
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.sku = sku;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public double getPrice(){
		return price;
	}
	
	public void setName(double price ){
		this.price = price;
	}
	
	public int getQuantity(){
		return quantity;
	}
	
	public void setName(int quantity ){
		this.quantity = quantity;
	}
	
	public String getSku(){
		return sku;
	}
	
	public void setSku(String sku){
		this.sku = sku;
	}
}


class Order{
	private String orderId;
	private String customer;
	private ArrayList<Product> products = new ArrayList<>();
	
	public Order(String orderId, String customer){
		this.orderId = orderId;
		this.customer = customer;
	}
	
	public void addProduct(Product product){
		products.add(product);
	}
	
	public void removeProduct(Product product){
		//products.remove(Product.valueOf(product));
	}
	
	public String getOrderId(){
		return orderId;
	}
	
	public String getCustomer(){
		return customer;
	}
	
	public double getTotalPrice(){
	
		int totalPrice = 0;
		for(Product product : products){
			totalPrice += product.getPrice();
		}		
		return (double) totalPrice;
	}	
}

public class TulipExport{
	public static void main(String[] args){
		Order order = new Order("12QWE12ABCD", "Shahadat");
		Product keyboard = new Product("Gaming Keyboar", 44, 20, "ABCD#123");
		Product mouse = new Product("Gaming MOUSE", 66, 20, "ABCD#124");
		Product monitor = new Product("Dell M21", 200, 20, "ABCD#125");
		
		order.addProduct(keyboard);
		order.addProduct(mouse);
		order.addProduct(monitor);
		
		System.out.println(order.getTotalPrice());
	}
}
