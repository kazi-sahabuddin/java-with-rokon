class BMI{
	public static final double KILOGRAMS_PER_POUND = 0.45359237;
	public static final double METER_PER_INCH = 0.0254;
	
	private String name;
	private double weight;
	private double height;
	
	//Constructor
	public BMI(String name, double weight, double height){
		this.name = name;
		this.weight = weight;
		this.height = height;
	}
	
	public double getBMI(){
		double w = weight * KILOGRAMS_PER_POUND;
		double h = height * METER_PER_INCH;
		
		return w / (h * h);
	}
	
	public String getStatus(){
		double bmi = getBMI();		
		if(bmi < 18.5 ){
			return "UnderWeight";
		} else if(bmi >= 18.5 && bmi < 25){
			return "Normal";
		} else if(bmi >= 25 && bmi < 40){
			return "Overweight";
		} else if(bmi > 40 ){
			return "Obese";
		}
		
		return "";
	}
	
	public String getName(){
		return name;
	}	
}

public class BMITest {
	public static void main(String[] args){
		BMI bmi = new BMI("Tanvir Rifat", 145, 70);
		System.out.println("The BMI for "+ bmi.getName() + " is ("+ bmi.getBMI() + " ) " + bmi.getStatus());
	}
}
