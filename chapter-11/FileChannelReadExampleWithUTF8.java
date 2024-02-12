import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileChannelReadExampleWithUTF8{
	public static void main(String[] args){
		//Path filePath = Path.of("input.txt");
		Path filePath = Path.of("output.txt");
		if(!Files.exists(filePath)){
			System.out.println("The input file dosen't exist");
		}
		
		try(FileChannel fileChannel = new FileInputStream(filePath.toFile()).getChannel()){
			ByteBuffer buffer = ByteBuffer.allocate(1024);
			Charset charset = StandardCharsets.UTF_8;
			
			while(fileChannel.read(buffer) > 0){
				buffer.flip();
				CharBuffer charBuffer = charset.decode(buffer);
				
				while(charBuffer.hasRemaining()){
					char chr = charBuffer.get();
					System.out.print(chr);
				}
				buffer.clear();
			}
		} catch(IOException e){
			e.printStackTrace();
		}
	}
}
