import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileCopier{
	public static void main(String[] args){
		Path sourcePath = Path.of("hello.txt");
		Path destinationPath = Path.of("hello2.txt");
		copy(sourcePath, destinationPath);
	}
	
	public static void copy(Path sourcePath, Path destinationPath){
		if(!Files.exists(sourcePath) || !Files.exists(destinationPath)){
			System.out.println("Source or destination file doesn't exist!");
			return;
		}
		
		try(FileChannel srcChannel = new FileInputStream(sourcePath.toFile()).getChannel(); FileChannel sinkChannel = new FileOutputStream(destinationPath.toFile()).getChannel()){
			srcChannel.transferTo(0,srcChannel.size(), sinkChannel);
		
		} catch(IOException e){
			e.printStackTrace();
		}
	}
}
