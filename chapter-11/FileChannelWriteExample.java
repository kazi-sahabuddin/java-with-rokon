import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileChannelWriteExample{
	public static void main(String[] args){
		String data = "Write once, run anyWhere (WORA)";
		
		Path filePath = Path.of("output.txt");
		
		if(!Files.exists(filePath)){
			System.out.println(filePath + " doesn't exist, please create one.");
			return;
		}
		
		try(FileOutputStream fos = new FileOutputStream(filePath.toFile()); 
		FileChannel fileChannel = fos.getChannel()) {
			
			byte[] bytes = data.getBytes();
			ByteBuffer buffer = ByteBuffer.wrap(bytes);
			fileChannel.write(buffer);
			
		} catch(IOException e){
			e.printStackTrace();
		}
	}
}
