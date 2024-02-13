import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Set;


public class UniqueNameFinder{
	public static void main(String[] args) throws IOException{
		Path filePath = Path.of("names.txt");
		if(!Files.exists(filePath)){
			throw new FileNotFoundException(filePath + "dosen't exist");
		}
		
		String textInfile = Files.readString(filePath);
		String[] names = textInfile.split(",");
		
		Set<String> nameSet = new HashSet<>();
		for(String name: names){
			nameSet.add(name);
		}
		System.out.println("Unique names: " + nameSet);
	}
}
