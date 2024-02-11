import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class FileFilterExample2{
	public static void main(String[] args) throws IOException{
		Path pictureDir = Path.of("/home/sahabuddin/Downloads/");
		Stream<Path> filteredPath = Files.list(pictureDir).filter(file -> file.toString().endsWith(".png"));
		filteredPath.forEach(filePath -> {
			System.out.println(filePath);
		});
	}
}
