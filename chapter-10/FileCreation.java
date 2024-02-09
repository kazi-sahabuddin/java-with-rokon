import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.File;

public class FileCreation{
	public static void main(String[] args) throws IOException{
		Path filePath = Path.of("Hello.java");
		
		if(!Files.exists(filePath)){
			Path file= Files.createFile(filePath);
			System.out.println("file = "+file);
		}
		
		
		File myFile = new File("HelloWorld.java");
		boolean hasFileCreated = myFile.createNewFile();
		System.out.println("hasFileCreated = " + hasFileCreated);
		
		System.out.println("----------Directory Creation----------");
		//Path myFolder = Path.of("myFolder");
		//Path directory = Files.createDirectory(myFolder);
		//System.out.println(directory);
		
		Path myDir = Path.of("myDir/another");
		Path dir = Files.createDirectories(myDir);
		System.out.println(dir);
	}
}
