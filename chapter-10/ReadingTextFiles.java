import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadingTextFiles{
	public static void main(String[] args) throws IOException{
		Path path = Path.of("Hello.java");
		String text = Files.readString(path);
		System.out.println(text);
	}
}
