import java.io.IOException;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class ListFiles{
	/*public static void main(String[] args) throws IOException {
		Path myWorkingDir = Path.of("/home/sahabuddin/Desktop/javaWithRokon/chapter-10/");
		Stream<Path> list = Files.list(myWorkingDir);
		list.forEach(file -> {System.out.println(file);});
	}*/
	
	public static void main(String[] args) throws IOException {
		Path myWorkingDir = Path.of("/home/sahabuddin/Desktop/javaWithRokon/chapter-10/");
		File workingDirFile = myWorkingDir.toFile();
		File[] allFiles = workingDirFile.listFiles();
		for(File file : allFiles){
			System.out.println(file.toPath());
		}
	}
}
