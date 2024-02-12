import java.io.IOException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamExample{
	public static void main(String[] args){
		String destination = "output.txt";
		String data = "I love java programming language";
		
		OutputStream fos = null;
		try{
			fos = new FileOutputStream(destination);
			byte[] bytes = data.getBytes();
			fos.write(bytes);
			fos.flush();
			
		}catch(IOException e){
			System.err.println("Unable to write text in " + destination);
			e.printStackTrace();
		} finally {
			try{
				if(fos != null){
					fos.close();
				}
			} catch(IOException e){
			System.err.println("Unable to close the OutputStream");
			e.printStackTrace();
		}
		}
	}
}
