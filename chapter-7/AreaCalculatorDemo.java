class AreaCalculator {
	private static double PI = 3.14159265;
	
	//Area of Circle
	public double getArea(double radius){
		return PI * radius * radius;
	}
	
	//Area of Rectangle
	public double getArea(int length, int width){
	
		return length * width;		
	}
	
	// Area of Triangle
	public double getArea(double base, int height){
	
		return (base * height)/2;
			
	}
	public double getArea(double radius, double height){
		return ((2 *PI* radius * height) + (2*PI * radius * radius));
	}
}

public class AreaCalculatorDemo{
	public static void main(String[] args){
		AreaCalculator area = new AreaCalculator();
		//result = 28.27
		System.out.println("Area of Circle is " + area.getArea(3.0));
		//result = 36
		System.out.println("Area of Triangle is " + area.getArea(6.0, 12));
		//result = 12
		System.out.println("Area of Rectangel is " + area.getArea(3,4));
		// result = 207.35
		System.out.println("Area of Cylinder is "+area.getArea(3.0, 8.0));
	}
}
