import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;

class Scheduler{
	public static List<LocalDate> getSchedules(LocalDate startOfTheYear, LocalDate endOfTheYear, DayOfWeek dayOfWeek){
		List<LocalDate> dates = new ArrayList<>();
		LocalDate date = startOfTheYear.with(TemporalAdjusters.nextOrSame(dayOfWeek));
		
		do{
			dates.add(date);
			date = date.plusWeeks(1);
			
		}while(date.isBefore(endOfTheYear));
		
		return dates;
	}
}

public class SchedulerDemo{
	public static void main(String[] args){
		Scheduler scheduler = new Scheduler();
		
		LocalDate start = LocalDate.of(2024, Month.JANUARY, 1);
		LocalDate end = LocalDate.of(2024, Month.FEBRUARY, 29);
		
		List<LocalDate> schedules = scheduler.getSchedules(start, end, DayOfWeek.MONDAY);
		
		System.out.println(schedules);
	}
}
