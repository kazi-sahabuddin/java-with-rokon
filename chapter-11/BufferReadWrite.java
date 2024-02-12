import java.nio.ByteBuffer;
public class BufferReadWrite{
	public static void main(String[] args){
		ByteBuffer byteBuffer = ByteBuffer.allocate(8);
		System.out.println("Right After Creation: ");
		printBuffer(byteBuffer);
		for(int i = 10; i< 18; i++){
			byteBuffer.put((byte)i);
		}
		
		System.out.println("After populating Data: ");
		printBuffer(byteBuffer);
	}
	
	public static void printBuffer(ByteBuffer byteBuffer){
		int limit = byteBuffer.limit();
		System.out.println("Position: " +byteBuffer.capacity() +", limit: " + byteBuffer.limit() );
		System.out.print("Data: ");
		for(int i = 0; i < limit; i++){
			System.out.print(byteBuffer.get(i) + " ");
		}
		System.out.println();
	}
}
