class Author{
	private String name;
	private String email;
	private char gender;
	
	public Author(String name, String email, char gender){
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public void setEmail(String email){
		this.email = email;
	}
	
	public void setGender(char gender){
		this.gender = gender;
	}
	
	public String getName(){
		return name;
	}
	public String getEmail(){
		return email;
	}
	public char getGender(){
		return gender;
	}
}

class Book{
	private String name;
	private Author author;
	private double price;
	private int stock;
	
	public Book(String name, Author author, double price, int stock) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.stock = stock;	
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setAuthor(Author author){
		this.author = author;
	}
	
	public void setPrice(double price){
		this.price = price;
	}
	
	public void setStock(int stock){
		this.stock = stock;
	}
	
	public String getName(){
		return name;
	}
	public Author getAuthor(){
		return author;
	}
	public double getPrice(){
		return price;
	}
	public int getInStock(){
		return stock;
	}
}

public class AuthorBook{
	public static void main(String[] args){
		Author author = new Author("Tamim Shahriar Subeen", "subeen@book.com", 'M');
		Book book = new Book("Computer Programming", author, 250, 1000);
		
		System.out.println("Name of the book: " + book.getName());
		System.out.println("Name of the Author: "+ book.getAuthor().getName());
		System.out.println("Price of the book: " + book.getPrice());
		System.out.println("Available in stock: " + book.getInStock());
	}
}
