import java.util.Scanner;

class Stack{
	int[] stack;
	int top;
	Stack(int capacity){	
		this.stack = new int[capacity];	
		top = -1;
	}
	
	public void push(int val){
		if(top == stack.length-1){
			System.out.println("Stack is full!");
			return;
		}
		
		stack[++top] = val;
	}
	
	public int top(){
		if(top == -1){
			System.out.println("Stack is empty!");
			return -1;
		}
		
		return stack[top];
	}
	
	public void pop(){
		if(top == -1){
			System.out.println("Stack is empty!");
			return;
		}
		top--;
	}
};


public class Exercise_1{
	public static void main(String[] args){
		Stack stk = new Stack(10);
		
		stk.pop();
		stk.top();
		stk.push(1);
		stk.push(2);
		System.out.println(stk.top());
		stk.pop();
		System.out.println(stk.top());
		stk.pop();
		System.out.println(stk.top());
		stk.pop();
	}
}
