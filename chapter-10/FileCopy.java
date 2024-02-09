import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class FileCopy{
	public static void main(String[] args) throws IOException {
		Path copyFrom = Path.of("hello.txt");
		Path copyTo = Path.of("copied.txt");		
		Files.copy(copyFrom, copyTo, StandardCopyOption.REPLACE_EXISTING);
	}
}
