import java.time.ZoneOffset;

public class ZoneOffsetExample{
	public static void main(String[] args){
		ZoneOffset  bst = ZoneOffset.of("+0");
		System.out.println("Bangladesh time zone offset is : "+ bst);
	}
}
