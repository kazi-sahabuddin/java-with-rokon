import java.util.Stack;

public class StackDemo{
	public static void main(String[] args){
		String[] brackets = {"(()){}()", "({})", "({}(", "){})"};
		
		for(String exp : brackets){
			String isBalanced = isBalanced(exp) ? "balanced": "not balanced";
			System.out.println(exp + " is " + isBalanced);
		}
	}
	
	public static boolean isBalanced(String input){
		Stack<Character> stack = new Stack<>();
		
		for(char c : input.toCharArray()){
			if(c == '(' || c == '{' || c == '['){
				stack.push(c);
			} else if(c == ')' && (stack.isEmpty() || stack.pop() != '(')){
				return false;
			}else if(c == '}' && (stack.isEmpty() || stack.pop() != '{')){
				return false;
			}else if(c == ']' && (stack.isEmpty() || stack.pop() != '[')){
				return false;
			}
		} 
		return stack.isEmpty();
	}
}
