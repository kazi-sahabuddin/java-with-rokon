import java.time.LocalDate;
import java.time.Month;

public class LocalDateManipulation{
	public static void main(String[] args){
		LocalDate firstDayOf2024 = LocalDate.of(2024, Month.JANUARY, 1);
		LocalDate programmersDay = firstDayOf2024.plusDays(255);
		 firstDayOf2024 = firstDayOf2024.plusDays(255);
		System.out.println("Next Programmers day: " + programmersDay);
		System.out.println( firstDayOf2024);
		
		LocalDate today = LocalDate.now();
		int dayOfMonth = today.getDayOfMonth();
		System.out.println(dayOfMonth);
	}
}
