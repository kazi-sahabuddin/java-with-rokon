import java.util.ArrayList;
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
	
	private Transaction makePayment(){
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
