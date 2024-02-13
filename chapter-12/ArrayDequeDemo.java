import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo{
	public static void main(String[] args){
		String[] brackets = {"(()){}()", "({})", "({}(", "){})"};
		
		for(String exp : brackets){
			String isBalanced = isBalanced(exp) ? "balanced": "not balanced";
			System.out.println(exp + " is " + isBalanced);
		}
	}
	
	public static boolean isBalanced(String input){
		Deque<Character> deque = new ArrayDeque<>();
		
		for(char c : input.toCharArray()){
			if(c == '(' || c == '{' || c == '['){
				deque.push(c);
			} else if(c == ')' && (deque.isEmpty() || deque.pop() != '(')){
				return false;
			}else if(c == '}' && (deque.isEmpty() || deque.pop() != '{')){
				return false;
			}else if(c == ']' && (deque.isEmpty() || deque.pop() != '[')){
				return false;
			}
		} 
		return deque.isEmpty();
	}
}
