import java.util.Date;
import java.text.SimpleDateFormat;

public class SimpleDateFormateExample{
	public static void main(String[] args){
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date now = new Date();
		String formattedDateTime = sdf.format(now);
		System.out.println(formattedDateTime);
	}
}
