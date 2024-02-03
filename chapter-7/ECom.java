import java.util.ArrayList;
import java.time.LocalDateTime;
import java.util.UUID;

abstract class AbstractProduct{
	private final String name;
	private final int price;
	private final int discount;
	
	public AbstractProduct(String name, int price, int discount){
		this.name = name;
		this.price = price;
		this.discount = discount;
	}
	
	public abstract int calculatePrice();
	
	public String getName(){
		return name;
	}
	
	public int getPrice(){
		return price;
	}
	
	public int getDiscount(){
		return discount;
	}
}

class DigitalProduct extends AbstractProduct{
	private static final String JAVA_25 = "JAVA25";
	private static final String JAVA_2NDED = "JAVA2NDED";
	
	private String coupon;
	
	public DigitalProduct(String name, int price, int discount, String coupon){
		this(name, price, discount);	
		this.coupon = coupon;
	}
	
	public DigitalProduct(String name, int price, int discount){
		super(name, price, discount);
	}
	
	@Override
	public int  calculatePrice(){
		int couponDiscount = switch(coupon != null ? coupon : ""){
			case JAVA_25 -> 3;
			case JAVA_2NDED -> 5;
			default -> 0;
		};
		
		int totalDiscount = getDiscount() + couponDiscount;
		
		double price = getPrice() * ((100 - totalDiscount) / 100.0);
		
		return (int) price;
		
	}
}

class Dimension {
	private final int height;
	private final int length;
	private final int width;
	
	public Dimension(int height, int length, int width){
		this.height = height;
		this.length = length;
		this.width = width;
	}
	
	public int getVolume(){
		return this.height * this.length * this.width;
	}
}

class NonDigitalProduct extends AbstractProduct{
	public static final int SHIPPING_RATE = 6;
	public static final double DIMENSION_CHARGE = 1.5;
	
	private final int weight;
	private final Dimension dimension;
	
	public NonDigitalProduct(String name, int price, int discount, int weight, Dimension dimension){
		super(name, price, discount);
		this.weight = weight;
		this.dimension = dimension;
	}
	
	@Override
	public int calculatePrice(){
		double price = this.getPrice() * ( (100-getDiscount() ) / 100.0);
		price += weight * SHIPPING_RATE;
		
		if(dimension.getVolume() > 10){
			price += dimension.getVolume() * DIMENSION_CHARGE;
		}
		
		return (int) price;
	}	
}

class ShoppingCart{
	private ArrayList<AbstractProduct> products = new ArrayList<>();
	
	public void addProduct(AbstractProduct product){
		products.add(product);
	}
	
	public int getTotalPrice(){
		int totalPrice = 0;
		for(AbstractProduct product : products){
			totalPrice += product.calculatePrice();
		}
		
		return totalPrice;
	}
	
	@Override
	public String toString(){
		return "ShoppingCart{ products=" + products + '}';
	}
}

class Customer{
	private final String name;
	private CreditCard creditCard;
	
	public Customer(String name, long number, int cvv, String validThrough){
		this.name = name;
		this.creditCard = new CreditCard(number, cvv, validThrough);
	}
	
	public Customer(String name, CreditCard creditCard){
		this.name = name;
		this.creditCard = creditCard;
	}

	public Order checkout(ShoppingCart cart){
		Transaction transaction = makePayment(cart);
		
		return new Order(this, cart, transaction);	
	}
	
	private Transaction makePayment(ShoppingCart cart){
		//making payment with credit card
		//for simplicity, ignoring the credit application here
		
		return new Transaction(UUID.randomUUID(), cart.getTotalPrice());
	}
}

class CreditCard{
	private final long number;
	private final int cvv;
	private final String validThrough;
	
	public CreditCard(long number, int cvv, String validThrough){
		this.number = number;
		this.cvv = cvv;
		this.validThrough = validThrough;
	}
}

class Transaction {
	private final UUID transactionId;
	private final int value;
	private final LocalDateTime creationTime;
	
	public Transaction(UUID transactionId, int value){
		this.transactionId = transactionId;
		this.value = value;
		this.creationTime = LocalDateTime.now();
	}
	
	@Override
	public String toString(){
		return "transactionId="+transactionId + ", value=" +value+", creationTime=" + creationTime;
	}
}

class Order{
	private final Customer customer;
	private final ShoppingCart shoppingCart;
	private final Transaction transaction;
	
	public Order(Customer customer, ShoppingCart shoppingCart, Transaction transaction){
		this.customer = customer;
		this.shoppingCart = shoppingCart;
		this.transaction = transaction;
	}
	
	public Customer getCustomer(){
		return customer;
	}
	
	public ShoppingCart getShoppingCart(){
		return shoppingCart;
	}
	
	public Transaction getTransaction(){
		return transaction;
	}
	
	@Override
	public String toString(){
		return "Order{" +"\n customer="+ customer+
				"\n cart="+shoppingCart +
				"\n payment="+ transaction +
				"\n}";
	}
}

public class ECom{
	public static void main(String[] args){
		ShoppingCart shoppingCart = new ShoppingCart();
		NonDigitalProduct keyboard = new NonDigitalProduct("Mechanical Gaming Keyboard", 48, 10, 450, new Dimension(1,10,2));
		NonDigitalProduct mouse = new NonDigitalProduct("Gaming Mouse", 48, 15, 100, new Dimension(1,1,2));
		NonDigitalProduct ecoDot = new NonDigitalProduct("Eco Dot(4th Generation)", 40, 12, 150, new Dimension(1,2,2));
		
		shoppingCart.addProduct(keyboard);
		shoppingCart.addProduct(mouse);
		shoppingCart.addProduct(ecoDot);
		
		DigitalProduct javaProgrammingEbook = new DigitalProduct("Java Programming",750, 15);
		DigitalProduct advanceJavaProgrammingEbook = new DigitalProduct("Advance Java Programming",750, 15, "JAVA25");
		
		shoppingCart.addProduct(javaProgrammingEbook);
		shoppingCart.addProduct(advanceJavaProgrammingEbook);
		
		System.out.println("shoppingCart = "+shoppingCart);
		int totalPrice = shoppingCart.getTotalPrice();
		System.out.println("totalPrice = "+ totalPrice);
		
		Customer customer = new Customer("Moasharraf", new CreditCard(3434343434L, 234, "03/27"));
		
		Order order = customer.checkout(shoppingCart);
		
		System.out.println(order);
		
	}
}
