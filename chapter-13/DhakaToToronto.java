import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DhakaToToronto{
	public static void main(String[] args){
	
		ZoneId dhakaZone = ZoneId.of("Asia/Dhaka");
		ZoneId torontoZone = ZoneId.of("Canada/Eastern");
		
		LocalDateTime localTakeOffTime = LocalDateTime.of(2024,Month.FEBRUARY, 7, 10, 5);
		ZonedDateTime zonedTakeOffTime = ZonedDateTime.of(localTakeOffTime, dhakaZone);
		LocalDateTime localArrivalTime = LocalDateTime.of(2024, Month.FEBRUARY, 8, 14, 30);
		ZonedDateTime zonedArrivalTime = ZonedDateTime.of(localArrivalTime, torontoZone);
		
		//System.out.println("Dhaka: "+localTakeOffTime+"  "+zonedTakeOffTime);
		//System.out.println("Canada: "+localArrivalTime+"  "+zonedArrivalTime);
		
		Duration flightDuration = Duration.between(zonedTakeOffTime, zonedArrivalTime);
		long hours = flightDuration.toHours();
		int minutesPart = flightDuration.toMinutesPart();
		
		System.out.printf("Total Duration: %d hours %d minutes\n", hours, minutesPart);
	
	}
}
