import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;

public class BufferInfo {
    public static void main(String[] args){
    	ByteBuffer bb = ByteBuffer.allocate(8);
    	System.out.println("Capacity: " + bb.capacity());
    	System.out.println("Limit: " + bb.limit());
    	System.out.println("Position: " + bb.position());
    	
    	try{
    		bb.reset();
    		System.out.println("Mark: " + bb.capacity());
    	} catch(InvalidMarkException e){
    		System.out.println("Mark is not set");
    		e.printStackTrace();
    	}
    }
}
