import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.nio.file.Path;

public class FileRenamingExample{
	public static void main(String[] args) throws IOException{
		Path oldFilePath = Path.of("hello.txt");
		Path targetPath = Path.of("hello_renamed.txt");
		
		//Path moved = Files.move(oldFilePath, targetPath);
		Path moved = Files.move(oldFilePath, targetPath, StandardCopyOption.REPLACE_EXISTING);
		System.out.println(moved);
		Path filetodelete = Path.of("hello_renamed.txt");
		Files.delete(filetodelete);
	}
}
