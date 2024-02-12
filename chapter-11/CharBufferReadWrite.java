import java.nio.CharBuffer;

public class CharBufferReadWrite{
	public static void main(String[] args){
		CharBuffer charBuffer = CharBuffer.allocate(8);
		System.out.println("Right After Creation: ");
		printBuffer(charBuffer);
		for(int i = 65; i< 73; i++){
			charBuffer.put((char)i);
		}
		
		System.out.println("After populating Data: ");
		printBuffer(charBuffer);
	}
	
	public static void printBuffer(CharBuffer charBuffer){
		int limit = charBuffer.limit();
		System.out.println("Position: " +charBuffer.capacity() +", limit: " + charBuffer.limit() );
		System.out.print("Data: ");
		for(int i = 0; i < limit; i++){
			System.out.print(charBuffer.get(i) + " ");
		}
		System.out.println();
	}
}
