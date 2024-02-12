import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingPrimitivesExample{
	public static void main(String[] args){
		String fileName = "primitives.data";
		try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))){
			dos.writeInt(150);
			dos.writeDouble(4.24);
			dos.writeBoolean(true);
			dos.writeLong(Long.MAX_VALUE);
			dos.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
