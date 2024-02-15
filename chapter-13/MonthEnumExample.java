import java.time.Month;

public class MonthEnumExample{
	public static void main(String[] args){
		Month[] months = Month.values();
		for(Month month : months){
			//System.out.print(month+ ", " );
			System.out.println(month);
		}
		//System.out.println();
	}
}
