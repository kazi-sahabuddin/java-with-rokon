import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WritingTextFile{
	public static void main(String[] main) throws IOException{
		Path path = Path.of("Hello.java");
		String code = """
			public class Hello{
			public static void main(String[] args ){
				System.out.println("Hello World!");
			}
		}""";
		
		Files.writeString(path, code);
	}
}
