import java.io.IOException;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileChannelWriteExampleWithUTF8{
	public static void main(String[] args){
		String data = """ 
		আমি বাংলায় গান গাই
		আমি বাংলার গান গাই
		আমি আমার আমিকে চিরদিন এই বাংলায় খুঁজে পাই
		""";
		Path filePath = Path.of("output.txt");
		if(!Files.exists(filePath)){
			System.out.println(filePath + " dosen't exist, please create one.");
			return;
		}
		
		try(FileChannel fileChannel = new FileOutputStream(filePath.toFile()).getChannel()){
			Charset charset = StandardCharsets.UTF_8;
			
			CharBuffer charBuffer = CharBuffer.wrap(data);
			
			ByteBuffer encodedBuffer = charset.encode(charBuffer);
			fileChannel.write(encodedBuffer);
			
			
		} catch(IOException e){
			e.printStackTrace();
		}
	}
}
