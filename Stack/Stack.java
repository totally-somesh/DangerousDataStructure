package Stack;

public class Stack <T> {

	private int size;
	private int top;
	private T [] arr;
	
	public Stack(int size){

		this.size = size;
		arr = (T [])new Object [size]; 
		this.top = -1;		
	}
	
	public boolean isEmpty() {
		
		if(top == -1) {
			return true;
		}	
		return false;	
	}
	
	public boolean isFull() {
		
		if(top == size - 1) {
			return true;
		}
		return false;
	}
	
	public boolean push(T data) {
		
		if(isFull()) {
			return false;
		}
		
		arr[++top] = data;
		return true;		
	}
	
	public T pop() {
		
		if(isEmpty()) {
			return null;
		}
		
		return arr[top--];
	}

	public T peek() {
		
		if(isEmpty()) {
			return null;
		}
		
		return arr[top];
	}

}
