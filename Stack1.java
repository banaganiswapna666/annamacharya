import java.util.Stack;
public class Stack1{
	public static void main(String[] args){
		Stack<Integer> stack=new Stack<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println("top element:"+stack.peek());
		System.out.println("popped:"+stack.pop());
		System.out.println("is empty:"+stack.isEmpty());
		System.out.println("size of the stack:"+stack.size());
	}
}